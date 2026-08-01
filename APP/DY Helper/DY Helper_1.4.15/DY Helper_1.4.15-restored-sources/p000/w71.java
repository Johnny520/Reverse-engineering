package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class w71 {

    /* JADX INFO: renamed from: α */
    public static final java.util.List f11592 = null;

    static {
            java.lang.String r0 = "copy_link"
            java.lang.String r1 = "open_author"
            java.lang.String r2 = "download_default"
            java.lang.String r3 = "work_bookmark"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.w71.f11592 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.String m6325(java.lang.String r1) {
            int r0 = r1.hashCode()
            switch(r0) {
                case -1845502698: goto L7a;
                case -1761221747: goto L6e;
                case -1649152869: goto L62;
                case 340837577: goto L56;
                case 626738557: goto L4a;
                case 631173032: goto L3e;
                case 631214427: goto L35;
                case 631627229: goto L2c;
                case 692437008: goto L20;
                case 1010979055: goto L13;
                case 1163650983: goto L9;
                default: goto L7;
            }
        L7:
            goto L82
        L9:
            java.lang.String r0 = "下载图片和动图"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L47
            goto L82
        L13:
            java.lang.String r0 = "取消作品书签"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1d
            goto L82
        L1d:
            java.lang.String r1 = "已收藏"
            return r1
        L20:
            java.lang.String r0 = "打开作者主页"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L29
            goto L82
        L29:
            java.lang.String r1 = "作者"
            return r1
        L2c:
            java.lang.String r0 = "下载视频"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L47
            goto L82
        L35:
            java.lang.String r0 = "下载图片"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L47
            goto L82
        L3e:
            java.lang.String r0 = "下载动图"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L47
            goto L82
        L47:
            java.lang.String r1 = "下载"
            return r1
        L4a:
            java.lang.String r0 = "作品书签"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L53
            goto L82
        L53:
            java.lang.String r1 = "收藏"
            return r1
        L56:
            java.lang.String r0 = "恢复隐藏联系人"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5f
            goto L82
        L5f:
            java.lang.String r1 = "恢复隐藏"
            return r1
        L62:
            java.lang.String r0 = "作者主页书签"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L6b
            goto L82
        L6b:
            java.lang.String r1 = "收藏作者"
            return r1
        L6e:
            java.lang.String r0 = "取消作者主页书签"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L77
            goto L82
        L77:
            java.lang.String r1 = "已收藏作者"
            return r1
        L7a:
            java.lang.String r0 = "临时显示隐藏联系人"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L83
        L82:
            return r1
        L83:
            java.lang.String r1 = "显示联系人"
            return r1
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.String m6326(java.lang.String r1) {
            int r0 = r1.hashCode()
            switch(r0) {
                case -1093583478: goto L44;
                case -559337184: goto L38;
                case 442856100: goto L2c;
                case 1186609032: goto L20;
                case 1322598762: goto L14;
                case 1505434244: goto L8;
                default: goto L7;
            }
        L7:
            goto L4c
        L8:
            java.lang.String r0 = "copy_link"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L11
            goto L4c
        L11:
            java.lang.String r1 = "复制链接"
            return r1
        L14:
            java.lang.String r0 = "author_bookmark"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1d
            goto L4c
        L1d:
            java.lang.String r1 = "收藏作者"
            return r1
        L20:
            java.lang.String r0 = "hidden_contact_toggle"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L29
            goto L4c
        L29:
            java.lang.String r1 = "隐藏联系人"
            return r1
        L2c:
            java.lang.String r0 = "work_bookmark"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L35
            goto L4c
        L35:
            java.lang.String r1 = "收藏"
            return r1
        L38:
            java.lang.String r0 = "open_author"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L41
            goto L4c
        L41:
            java.lang.String r1 = "作者"
            return r1
        L44:
            java.lang.String r0 = "download_default"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5b
        L4c:
            java.lang.String r0 = "action:"
            java.lang.String r1 = p000.q02.m4678(r1, r0)
            boolean r0 = p000.q02.m4671(r1)
            if (r0 == 0) goto L5a
            java.lang.String r1 = "未配置"
        L5a:
            return r1
        L5b:
            java.lang.String r1 = "下载"
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.String m6327(java.lang.String r1) {
            int r0 = r1.hashCode()
            switch(r0) {
                case -1845502698: goto L86;
                case -1761221747: goto L7a;
                case -1649152869: goto L71;
                case 340837577: goto L68;
                case 626738557: goto L5c;
                case 631146295: goto L50;
                case 631173032: goto L47;
                case 631214427: goto L3e;
                case 631627229: goto L35;
                case 692437008: goto L29;
                case 700578544: goto L1c;
                case 1010979055: goto L12;
                case 1163650983: goto L9;
                default: goto L7;
            }
        L7:
            goto L8e
        L9:
            java.lang.String r0 = "下载图片和动图"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L8e
            goto L59
        L12:
            java.lang.String r0 = "取消作品书签"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L65
            goto L8e
        L1c:
            java.lang.String r0 = "复制链接"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L26
            goto L8e
        L26:
            java.lang.String r1 = "copy_link"
            return r1
        L29:
            java.lang.String r0 = "打开作者主页"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L32
            goto L8e
        L32:
            java.lang.String r1 = "open_author"
            return r1
        L35:
            java.lang.String r0 = "下载视频"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L59
            goto L8e
        L3e:
            java.lang.String r0 = "下载图片"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L59
            goto L8e
        L47:
            java.lang.String r0 = "下载动图"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L59
            goto L8e
        L50:
            java.lang.String r0 = "下载作品"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L59
            goto L8e
        L59:
            java.lang.String r1 = "download_default"
            return r1
        L5c:
            java.lang.String r0 = "作品书签"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L65
            goto L8e
        L65:
            java.lang.String r1 = "work_bookmark"
            return r1
        L68:
            java.lang.String r0 = "恢复隐藏联系人"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L95
            goto L8e
        L71:
            java.lang.String r0 = "作者主页书签"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L83
            goto L8e
        L7a:
            java.lang.String r0 = "取消作者主页书签"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L83
            goto L8e
        L83:
            java.lang.String r1 = "author_bookmark"
            return r1
        L86:
            java.lang.String r0 = "临时显示隐藏联系人"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L95
        L8e:
            java.lang.String r0 = "action:"
            java.lang.String r1 = r0.concat(r1)
            return r1
        L95:
            java.lang.String r1 = "hidden_contact_toggle"
            return r1
    }
}
