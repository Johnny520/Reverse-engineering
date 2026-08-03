package com.android.dx.command.dump;

/* JADX INFO: loaded from: classes.dex */
public final class ClassDumper extends com.android.dx.command.dump.BaseDumper {
    private ClassDumper(byte[] r1, java.io.PrintStream r2, java.lang.String r3, com.android.dx.command.dump.Args r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static void dump(byte[] r1, java.io.PrintStream r2, java.lang.String r3, com.android.dx.command.dump.Args r4) {
            com.android.dx.command.dump.ClassDumper r0 = new com.android.dx.command.dump.ClassDumper
            r0.<init>(r1, r2, r3, r4)
            r0.dump()
            return
    }

    public void dump() {
            r5 = this;
            byte[] r0 = r5.getBytes()
            com.android.dx.util.ByteArray r1 = new com.android.dx.util.ByteArray
            r1.<init>(r0)
            com.android.dx.cf.direct.DirectClassFile r2 = new com.android.dx.cf.direct.DirectClassFile
            java.lang.String r3 = r5.getFilePath()
            boolean r4 = r5.getStrictParse()
            r2.<init>(r1, r3, r4)
            com.android.dx.cf.direct.StdAttributeFactory r3 = com.android.dx.cf.direct.StdAttributeFactory.THE_ONE
            r2.setAttributeFactory(r3)
            r2.setObserver(r5)
            r2.getMagic()
            int r2 = r5.getReadBytes()
            int r3 = r0.length
            if (r2 == r3) goto L2f
            int r0 = r0.length
            int r0 = r0 - r2
            java.lang.String r3 = "<extra data at end of file>"
            r5.parsed(r1, r2, r0, r3)
        L2f:
            return
    }
}
