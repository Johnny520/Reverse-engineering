package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2107 {
    public C2107() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m9934(java.lang.String r1) {
            java.lang.String r0 = "START_ELEMENT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La
            r1 = 1
            return r1
        La:
            java.lang.String r0 = "SPACE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L14
            r1 = 6
            return r1
        L14:
            java.lang.String r0 = "END_ELEMENT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
            r1 = 2
            return r1
        L1e:
            java.lang.String r0 = "PROCESSING_INSTRUCTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L28
            r1 = 3
            return r1
        L28:
            java.lang.String r0 = "CHARACTERS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L32
            r1 = 4
            return r1
        L32:
            java.lang.String r0 = "COMMENT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3c
            r1 = 5
            return r1
        L3c:
            java.lang.String r0 = "START_DOCUMENT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L46
            r1 = 7
            return r1
        L46:
            java.lang.String r0 = "END_DOCUMENT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L51
            r1 = 8
            return r1
        L51:
            java.lang.String r0 = "ATTRIBUTE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5c
            r1 = 10
            return r1
        L5c:
            java.lang.String r0 = "DTD"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L67
            r1 = 11
            return r1
        L67:
            java.lang.String r0 = "CDATA"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L72
            r1 = 12
            return r1
        L72:
            java.lang.String r0 = "NAMESPACE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7d
            r1 = 13
            return r1
        L7d:
            r1 = -1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String m9935(int r0) {
            switch(r0) {
                case 1: goto L2a;
                case 2: goto L27;
                case 3: goto L24;
                case 4: goto L21;
                case 5: goto L1e;
                case 6: goto L1b;
                case 7: goto L18;
                case 8: goto L15;
                case 9: goto L12;
                case 10: goto Lf;
                case 11: goto Lc;
                case 12: goto L9;
                case 13: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "UNKNOWN_EVENT_TYPE"
            return r0
        L6:
            java.lang.String r0 = "NAMESPACE"
            return r0
        L9:
            java.lang.String r0 = "CDATA"
            return r0
        Lc:
            java.lang.String r0 = "DTD"
            return r0
        Lf:
            java.lang.String r0 = "ATTRIBUTE"
            return r0
        L12:
            java.lang.String r0 = "ENTITY_REFERENCE"
            return r0
        L15:
            java.lang.String r0 = "END_DOCUMENT"
            return r0
        L18:
            java.lang.String r0 = "START_DOCUMENT"
            return r0
        L1b:
            java.lang.String r0 = "SPACE"
            return r0
        L1e:
            java.lang.String r0 = "COMMENT"
            return r0
        L21:
            java.lang.String r0 = "CHARACTERS"
            return r0
        L24:
            java.lang.String r0 = "PROCESSING_INSTRUCTION"
            return r0
        L27:
            java.lang.String r0 = "END_ELEMENT"
            return r0
        L2a:
            java.lang.String r0 = "START_ELEMENT"
            return r0
    }
}
