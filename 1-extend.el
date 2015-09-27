(defun jump-to-next-slide ()
  (interactive)
  (find-file
   (car (file-expand-wildcards (concat
                                "/Users/rwang/work/talk_emacs/"
                                (number-to-string (+ 1 (string-to-int (car (split-string (buffer-name) "-")))))
                                "-*"))))
  )

(global-set-key (kbd "<f5>") 'jump-to-next-slide)
