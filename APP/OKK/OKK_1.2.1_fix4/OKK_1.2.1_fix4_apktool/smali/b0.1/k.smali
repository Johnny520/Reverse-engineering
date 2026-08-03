.class public abstract Lb0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;

.field public static final b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 27

    const-string v19, "\u7981\u7528\u70ed\u66f4\u65b0"

    const-string v20, "\u865a\u62df\u5b9a\u4f4d"

    const-string v0, "\u8bbe\u7f6e\u5165\u53e3"

    const-string v1, "\u9690\u85cf\u9996\u9875\u5206\u9694\u7ebf"

    const-string v2, "\u6298\u53e0\u9876\u680f"

    const-string v3, "\u5e95\u680f\u56fe\u6807"

    const-string v4, "\u60ac\u6d6e\u5e95\u680f"

    const-string v5, "\u5706\u89d2\u5934\u50cf"

    const-string v6, "\u9996\u9875\u5934\u50cf\u5165\u53e3"

    const-string v7, "\u4e3b\u9898\u58c1\u7eb8"

    const-string v8, "\u9632\u64a4\u56de"

    const-string v9, "\u804a\u5929\u589e\u5f3a"

    const-string v10, "\u5220\u9664\u6e05\u5f15\u7528"

    const-string v11, "\u4fee\u6539\u6d88\u606f"

    const-string v12, "\u8f93\u5165\u7edf\u8ba1"

    const-string v13, "\u670b\u53cb\u5708\u9632\u5220"

    const-string v14, "\u670b\u53cb\u5708\u8bc4\u8bba\u9632\u64a4\u56de"

    const-string v15, "\u670b\u53cb\u5708\u5e7f\u544a"

    const-string v16, "\u8d44\u6599\u9875 ID"

    const-string v17, "\u5b9e\u540d\u5c3e\u5b57"

    const-string v18, "\u7fa4\u5458\u5934\u8854"

    const-string v21, "PC \u81ea\u52a8\u767b\u5f55"

    const-string v22, "\u5730\u56fe\u9009\u70b9"

    filled-new-array/range {v0 .. v22}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lb0/k;->a:Ljava/util/List;

    new-instance v0, Lb0/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    new-instance v2, Lb0/f;

    const-string v1, "SettingsEntry"

    const-string v3, "\u8bbe\u7f6e\u5165\u53e3"

    invoke-direct {v2, v1, v3, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    new-instance v3, Lb0/f;

    const-string v1, "HideHomeDivider"

    const-string v4, "\u9690\u85cf\u9996\u9875\u5206\u9694\u7ebf"

    invoke-direct {v3, v1, v4, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    new-instance v4, Lb0/f;

    const-string v1, "FoldBannerPin"

    const-string v5, "\u6298\u53e0\u9876\u680f"

    invoke-direct {v4, v1, v5, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    new-instance v5, Lb0/f;

    const-string v1, "BottomTabIcon"

    const-string v6, "\u5e95\u680f\u56fe\u6807"

    invoke-direct {v5, v1, v6, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    new-instance v6, Lb0/f;

    const-string v1, "BottomTabFloating"

    const-string v7, "\u60ac\u6d6e\u5e95\u680f"

    invoke-direct {v6, v1, v7, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    new-instance v7, Lb0/f;

    const-string v1, "RoundAvatar"

    const-string v8, "\u5706\u89d2\u5934\u50cf"

    invoke-direct {v7, v1, v8, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    new-instance v8, Lb0/f;

    const-string v1, "HomeAvatar"

    const-string v9, "\u9996\u9875\u5934\u50cf\u5165\u53e3"

    invoke-direct {v8, v1, v9, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    new-instance v9, Lb0/f;

    const-string v1, "ThemeWallpaper"

    const-string v10, "\u4e3b\u9898\u58c1\u7eb8"

    invoke-direct {v9, v1, v10, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    new-instance v10, Lb0/f;

    const-string v1, "AntiRevoke"

    const-string v11, "\u9632\u64a4\u56de"

    invoke-direct {v10, v1, v11, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    new-instance v11, Lb0/f;

    const-string v1, "ChatEnhance"

    const-string v12, "\u804a\u5929\u589e\u5f3a"

    invoke-direct {v11, v1, v12, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    new-instance v12, Lb0/f;

    const-string v1, "QuoteDeleteClear"

    const-string v13, "\u5220\u9664\u6e05\u5f15\u7528"

    invoke-direct {v12, v1, v13, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    new-instance v13, Lb0/f;

    const-string v1, "EditMessage"

    const-string v14, "\u4fee\u6539\u6d88\u606f"

    invoke-direct {v13, v1, v14, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    new-instance v14, Lb0/f;

    const-string v1, "InputStats"

    const-string v15, "\u8f93\u5165\u7edf\u8ba1"

    invoke-direct {v14, v1, v15, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    new-instance v15, Lb0/f;

    const-string v1, "AntiMomentsDelete"

    move-object/from16 v16, v14

    const-string v14, "\u670b\u53cb\u5708\u9632\u5220"

    invoke-direct {v15, v1, v14, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    new-instance v1, Lb0/f;

    const-string v14, "AntiMomentsComment"

    move-object/from16 v17, v15

    const-string v15, "\u670b\u53cb\u5708\u8bc4\u8bba\u9632\u64a4\u56de"

    invoke-direct {v1, v14, v15, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/16 v14, 0x14

    invoke-direct {v0, v14}, Lb0/e;-><init>(I)V

    new-instance v15, Lb0/f;

    const-string v14, "MomentsAdBlock"

    move-object/from16 v18, v1

    const-string v1, "\u670b\u53cb\u5708\u5e7f\u544a"

    invoke-direct {v15, v14, v1, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    new-instance v1, Lb0/f;

    const-string v14, "ProfileId"

    move-object/from16 v19, v15

    const-string v15, "\u8d44\u6599\u9875 ID"

    invoke-direct {v1, v14, v15, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/16 v14, 0x16

    invoke-direct {v0, v14}, Lb0/e;-><init>(I)V

    new-instance v15, Lb0/f;

    const-string v14, "RealNameTail"

    move-object/from16 v20, v1

    const-string v1, "\u5b9e\u540d\u5c3e\u5b57"

    invoke-direct {v15, v14, v1, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    new-instance v1, Lb0/f;

    const-string v14, "MemberTitle"

    move-object/from16 v21, v15

    const-string v15, "\u7fa4\u5458\u5934\u8854"

    invoke-direct {v1, v14, v15, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/4 v14, 0x1

    invoke-direct {v0, v14}, Lb0/e;-><init>(I)V

    new-instance v15, Lb0/f;

    const-string v14, "DisableHotUpdate"

    move-object/from16 v22, v1

    const-string v1, "\u7981\u7528\u70ed\u66f4\u65b0"

    invoke-direct {v15, v14, v1, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    new-instance v1, Lb0/f;

    const-string v14, "VirtualLocation"

    move-object/from16 v23, v15

    const-string v15, "\u865a\u62df\u5b9a\u4f4d"

    invoke-direct {v1, v14, v15, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/4 v14, 0x4

    invoke-direct {v0, v14}, Lb0/e;-><init>(I)V

    new-instance v15, Lb0/f;

    const-string v14, "AutoLoginWin"

    move-object/from16 v24, v1

    const-string v1, "PC \u81ea\u52a8\u767b\u5f55"

    invoke-direct {v15, v14, v1, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    new-instance v1, Lb0/f;

    const-string v14, "MapPickBridge"

    move-object/from16 v25, v15

    const-string v15, "\u5730\u56fe\u9009\u70b9"

    invoke-direct {v1, v14, v15, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/4 v14, 0x6

    invoke-direct {v0, v14}, Lb0/e;-><init>(I)V

    new-instance v15, Lb0/f;

    const-string v14, "DownloadRedirect"

    move-object/from16 v26, v1

    const-string v1, "\u4e0b\u8f7d\u91cd\u5b9a\u5411"

    invoke-direct {v15, v14, v1, v0}, Lb0/f;-><init>(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    move-object/from16 v14, v16

    move-object/from16 v0, v19

    move-object/from16 v1, v21

    move-object/from16 v21, v23

    move-object/from16 v23, v25

    move-object/from16 v25, v15

    move-object/from16 v15, v17

    move-object/from16 v16, v18

    move-object/from16 v17, v0

    move-object/from16 v18, v20

    move-object/from16 v19, v1

    move-object/from16 v20, v22

    move-object/from16 v22, v24

    move-object/from16 v24, v26

    filled-new-array/range {v2 .. v25}, [Lb0/f;

    move-result-object v0

    invoke-static {v0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lb0/k;->b:Ljava/util/List;

    return-void
.end method

.method public static a(Lb0/f;I)Ljava/lang/String;
    .locals 1

    const-string v0, "probe"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lb0/k;->a:Ljava/util/List;

    invoke-static {p0, p1}, LE0/l;->q0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-nez p0, :cond_0

    add-int/lit8 p1, p1, 0x1

    const-string p0, "\u529f\u80fd"

    invoke-static {p0, p1}, LS/d;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method
