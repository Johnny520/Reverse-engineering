package p000;

/* JADX INFO: renamed from: aj */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0020aj implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f276;

    public /* synthetic */ ThreadFactoryC0020aj(int r1) {
            r0 = this;
            r0.f276 = r1
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r2) {
            r1 = this;
            int r1 = r1.f276
            switch(r1) {
                case 0: goto L49;
                case 1: goto L46;
                case 2: goto L43;
                case 3: goto L3e;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L30;
                case 8: goto L2d;
                case 9: goto L2a;
                case 10: goto L27;
                case 11: goto L24;
                case 12: goto L21;
                case 13: goto L1e;
                case 14: goto L1b;
                case 15: goto L18;
                case 16: goto L15;
                case 17: goto L10;
                case 18: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = "DY-ShareActionSave"
        L7:
            r0 = 1
            java.lang.Thread r1 = p000.AbstractC0602nx.m4139(r2, r1, r0)
            return r1
        Ld:
            java.lang.String r1 = "DY-IMRuleDialog"
            goto L7
        L10:
            java.lang.Thread r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.m1437(r2)
            return r1
        L15:
            java.lang.String r1 = "r835fa64311f18a7"
            goto L7
        L18:
            java.lang.String r1 = "r6cf01fd093683163"
            goto L7
        L1b:
            java.lang.String r1 = "r22ccd7c86882c0eb"
            goto L7
        L1e:
            java.lang.String r1 = "rcd202de33ab849df"
            goto L7
        L21:
            java.lang.String r1 = "DY-IMInteractiveDelete"
            goto L7
        L24:
            java.lang.String r1 = "DY-IMConversationDelete"
            goto L7
        L27:
            java.lang.String r1 = "DY-IMDeleteLoad"
            goto L7
        L2a:
            java.lang.String r1 = "DY-IMCatalogNameResolve"
            goto L7
        L2d:
            java.lang.String r1 = "DY-HiddenContactDialog"
            goto L7
        L30:
            java.lang.String r1 = "DY-GroupApply"
            goto L7
        L33:
            java.lang.String r1 = "DY-GroupApply-Auto"
            goto L7
        L36:
            java.lang.String r1 = "r5990943ada2f0d15"
            goto L7
        L39:
            java.lang.Thread r1 = org.luckypray.dexkit.DexKitCacheBridge.m4259(r2)
            return r1
        L3e:
            java.lang.Thread r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.m1397(r2)
            return r1
        L43:
            java.lang.String r1 = "r399daf3090944eff"
            goto L7
        L46:
            java.lang.String r1 = "rbb0ae2e153222b7"
            goto L7
        L49:
            java.lang.String r1 = "rd1ce5956d5212b55"
            goto L7
    }
}
