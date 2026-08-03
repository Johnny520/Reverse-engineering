package com.kongzue.dialogx.util;

/* JADX INFO: loaded from: classes2.dex */
public class DialogListBuilder {
    java.util.ArrayList<com.kongzue.dialogx.interfaces.BaseDialog> dialogs;

    public DialogListBuilder() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kongzue.dialogx.util.DialogListBuilder create(com.kongzue.dialogx.interfaces.BaseDialog... r4) {
            com.kongzue.dialogx.util.DialogListBuilder r0 = new com.kongzue.dialogx.util.DialogListBuilder
            r0.<init>()
            int r1 = r4.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L13
            r3 = r4[r2]
            if (r3 == 0) goto L10
            r0.add(r3)
        L10:
            int r2 = r2 + 1
            goto L7
        L13:
            return r0
    }

    public com.kongzue.dialogx.util.DialogListBuilder add(com.kongzue.dialogx.interfaces.BaseDialog r2) {
            r1 = this;
            java.util.ArrayList<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r1.dialogs
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.dialogs = r0
        Lb:
            if (r2 == 0) goto L22
            boolean r0 = r2.isShow()
            if (r0 != 0) goto L22
            boolean r0 = r2.isPreShow()
            if (r0 == 0) goto L1a
            goto L22
        L1a:
            r2.setDialogListBuilder(r1)
            java.util.ArrayList<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r1.dialogs
            r0.add(r2)
        L22:
            return r1
    }

    public void clear() {
            r1 = this;
            java.util.ArrayList<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r1.dialogs
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            return
    }

    public boolean isEmpty() {
            r2 = this;
            java.util.ArrayList<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r2.dialogs
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            java.util.ArrayList<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r2.dialogs
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            java.util.ArrayList<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r2.dialogs
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L1d
            java.util.ArrayList<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r2.dialogs
            r0.remove(r1)
            goto L6
        L1d:
            java.util.ArrayList<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r2.dialogs
            boolean r0 = r0.isEmpty()
            return r0
    }

    public com.kongzue.dialogx.util.DialogListBuilder show() {
            r2 = this;
            java.util.ArrayList<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r2.dialogs
            if (r0 == 0) goto L2d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto L2d
        Lb:
            java.util.ArrayList<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r2.dialogs
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L22
            java.util.ArrayList<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r2.dialogs
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L22
            java.util.ArrayList<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r2.dialogs
            r0.remove(r1)
            goto Lb
        L22:
            java.util.ArrayList<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r2.dialogs
            java.lang.Object r0 = r0.get(r1)
            com.kongzue.dialogx.interfaces.BaseDialog r0 = (com.kongzue.dialogx.interfaces.BaseDialog) r0
            r0.show()
        L2d:
            return r2
    }

    public void showNext() {
            r2 = this;
            java.util.ArrayList<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r2.dialogs
            if (r0 == 0) goto L2c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto L2c
        Lb:
            java.util.ArrayList<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r2.dialogs
            r1 = 0
            r0.remove(r1)
            java.util.ArrayList<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r2.dialogs
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2c
            java.util.ArrayList<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r2.dialogs
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L2c
            java.util.ArrayList<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r2.dialogs
            java.lang.Object r0 = r0.get(r1)
            com.kongzue.dialogx.interfaces.BaseDialog r0 = (com.kongzue.dialogx.interfaces.BaseDialog) r0
            r0.show()
        L2c:
            return
    }
}
