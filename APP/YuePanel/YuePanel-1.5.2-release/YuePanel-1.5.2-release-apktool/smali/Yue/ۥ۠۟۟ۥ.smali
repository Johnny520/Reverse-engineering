.class public LYue/ۥ۠۟۟ۥ;
.super Ljava/lang/Object;


# static fields
.field public static ۥ:Lcom/kongzue/dialogx/dialogs/PopTip;

.field public static ۥ۟:Z

.field public static final ۥ۟۟:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06e6\u06e5\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public static ۥ۟۟۟:Lorg/json/JSONObject;

.field public static ۥ۟۟۟۟:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static ۥ۟۟۟۠:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final ۥ۟۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۢ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۢ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۢ۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۢۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۢۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟ۢ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v0, 0x391

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, LYue/ۥ۠۟۟ۥ;->ۥ۟۟:Ljava/util/List;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, LYue/ۥ۠۟۟ۥ;->ۥ۟۟۟۟:Ljava/util/HashMap;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, LYue/ۥ۠۟۟ۥ;->ۥ۟۟۟۠:Ljava/util/HashMap;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۤ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x1f

    invoke-static {v1}, LYue/ۥ۠۟۟ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥ۠۟۟ۥ;->ۥ۟۟۟ۡ:Ljava/lang/String;

    const/16 v1, 0x20

    invoke-static {v1}, LYue/ۥ۠۟۟ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x21

    invoke-static {v2}, LYue/ۥ۠۟۟ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_0
    const/16 v1, 0xf

    invoke-static {v1}, LYue/ۥ۠۟۟ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟۟ۡ(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONObject;

    if-eqz v1, :cond_3

    const/16 v2, 0xe

    :try_start_0
    invoke-static {v2}, LYue/ۥ۠۟۟ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xd

    invoke-static {v3}, LYue/ۥ۠۟۟ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xc

    invoke-static {v4}, LYue/ۥ۠۟۟ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    int-to-long v4, v4

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۧ()Ljava/lang/String;

    move-result-object v6

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۨ()J

    move-result-wide v7

    const/16 v9, 0xb

    invoke-static {v9}, LYue/ۥ۠۟۟ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/16 v10, 0xa

    invoke-static {v10}, LYue/ۥ۠۟۟ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1, v10}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    int-to-long v10, v1

    cmp-long v1, v7, v10

    if-nez v1, :cond_2

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x98

    int-to-long v6, v1

    cmp-long v1, v6, v4

    if-nez v1, :cond_2

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    invoke-static {v1}, LYue/ۥ۠۟۟ۥ;->ۥ۟۟۟ۨ(Z)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    sput-object v2, LYue/ۥ۠۟۟ۥ;->ۥ۟۟۟:Lorg/json/JSONObject;

    invoke-static {}, Lcom/yuexin/panel/ۥ;->ۥ۟۟۟ۦ()V

    goto :goto_1

    :cond_2
    :goto_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, LYue/ۥ۠ۢ۟;->ۥ۟۟۟ۢ(Ljava/io/File;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, LYue/ۥ۠ۢ۟;->ۥ۟۟۟ۢ(Ljava/io/File;)Z

    const/16 v0, 0x22

    invoke-static {v0}, LYue/ۥ۠۟۟ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۨۡۢ;->ۥ(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, LYue/ۥ۠ۢ۟;->ۥ۟۟۟ۢ(Ljava/io/File;)Z

    :goto_1
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ(J)V
.end method

.method public static native synthetic ۥ۟(Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
.end method

.method public static native synthetic ۥ۟۟(I)V
.end method

.method public static native synthetic ۥ۟۟۟(Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
.end method

.method public static native ۥ۟۟۟۟(Lorg/json/JSONArray;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static native ۥ۟۟۟۠(Lcom/yuexin/panel/myClass/itemInfo;)Z
.end method

.method public static native ۥ۟۟۟ۡ(Lorg/luckypray/dexkit/result/MethodDataList;)Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static native ۥ۟۟۟ۢ(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06e6\u06e5\u06df;",
            ">;)V"
        }
    .end annotation
.end method

.method public static native ۥۣ۟۟۟()Z
.end method

.method public static native synthetic ۥ۟۟۟ۤ(Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
.end method

.method public static native synthetic ۥ۟۟۟ۥ(Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
.end method

.method public static native synthetic ۥ۟۟۟ۦ(J)V
.end method

.method public static native synthetic ۥ۟۟۟ۧ(I)V
.end method

.method public static native ۥ۟۟۟ۨ(Z)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static native ۥ۟۟۠()V
.end method

.method public static native ۥ۟۟۠۟(Lorg/luckypray/dexkit/result/MethodDataList;Lcom/yuexin/panel/myClass/itemInfo;Ljava/lang/String;)Z
.end method

.method public static native ۥ۟۟۠۠(I)V
.end method

.method public static native ۥ۟۟۠ۡ(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native ۥ۟۟۠ۢ(IZLjava/lang/String;)V
.end method
