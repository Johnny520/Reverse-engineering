.class public LYue/ۥۢۤ۟ۧ;
.super Ljava/lang/Object;


# static fields
.field public static ۥ۟۟:LYue/ۥۢۤ۟ۧ;

.field public static final ۥ۟۟۟:Ljava/lang/String;

.field public static final ۥ۟۟۟۟:Ljava/lang/String;

.field public static final ۥ۟۟۟۠:Ljava/lang/String;

.field public static final ۥ۟۟۟ۡ:Ljava/lang/String;

.field public static final ۥ۟۟۟ۢ:Ljava/lang/String;

.field public static final ۥۣ۟۟۟:Ljava/lang/String;

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


# instance fields
.field public final ۥ:Lcom/google/gson/Gson;

.field public final ۥ۟:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xe1

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥۢۤ۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥۢۤ۟ۧ;->ۥ۟۟۟:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, LYue/ۥۢۤ۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥۢۤ۟ۧ;->ۥ۟۟۟۟:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, LYue/ۥۢۤ۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥۢۤ۟ۧ;->ۥ۟۟۟۠:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, LYue/ۥۢۤ۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥۢۤ۟ۧ;->ۥ۟۟۟ۡ:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, LYue/ۥۢۤ۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥۢۤ۟ۧ;->ۥ۟۟۟ۢ:Ljava/lang/String;

    const/4 v0, 0x5

    invoke-static {v0}, LYue/ۥۢۤ۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥۢۤ۟ۧ;->ۥۣ۟۟۟:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iput-object v0, p0, LYue/ۥۢۤ۟ۧ;->ۥ:Lcom/google/gson/Gson;

    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۤ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x6

    invoke-static {v2}, LYue/ۥۢۤ۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, LYue/ۥۢۤ۟ۧ;->ۥ۟:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_0
    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ(Ljava/lang/String;Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;)Z
.end method

.method public static native synthetic ۥ۟(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;)Z
.end method

.method public static native synthetic ۥ۟۟(Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;)I
.end method

.method public static native synthetic ۥ۟۟۟(Ljava/lang/String;Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;)Z
.end method

.method public static native synthetic ۥ۟۟۟۟(Ljava/lang/String;Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;)Z
.end method

.method public static native synthetic ۥ۟۟۟۠(Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;)I
.end method

.method public static native synthetic ۥ۟۟۟ۡ(Ljava/lang/String;Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;)Z
.end method

.method public static native ۥ۟۟۠ۡ()LYue/ۥۢۤ۟ۧ;
.end method

.method public static native synthetic ۥ۟۟۠ۥ(Ljava/lang/String;Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;)Z
.end method

.method public static native synthetic ۥ۟۟۠ۦ(Ljava/lang/String;Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;)Z
.end method

.method public static native synthetic ۥ۟۟۠ۧ(Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;)I
.end method

.method public static native synthetic ۥ۟۟۠ۨ(Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;)I
.end method

.method public static native synthetic ۥ۟۟ۡ(Ljava/lang/String;Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;)Z
.end method

.method public static native synthetic ۥ۟۟ۡ۟(Ljava/lang/String;Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;)Z
.end method

.method public static native synthetic ۥ۟۟ۡ۠(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;)Z
.end method


# virtual methods
.method public native ۥ۟۟۟ۢ(Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;)Z
.end method

.method public native ۥۣ۟۟۟(Ljava/lang/String;Z)V
.end method

.method public final native ۥ۟۟۟ۤ(Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;",
            ">;"
        }
    .end annotation
.end method

.method public native ۥ۟۟۟ۥ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public final native ۥ۟۟۟ۦ(Ljava/lang/String;)V
.end method

.method public native ۥ۟۟۟ۧ(Ljava/lang/String;)V
.end method

.method public native ۥ۟۟۟ۨ()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;",
            ">;"
        }
    .end annotation
.end method

.method public native ۥ۟۟۠()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;",
            ">;"
        }
    .end annotation
.end method

.method public native ۥ۟۟۠۟()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;",
            ">;"
        }
    .end annotation
.end method

.method public native ۥ۟۟۠۠(Ljava/lang/String;)I
.end method

.method public native ۥ۟۟۠ۢ()V
.end method

.method public native ۥۣ۟۟۠(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public final native ۥ۟۟۠ۤ(Ljava/util/Set;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation
.end method

.method public native ۥ۟۟ۡۡ(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;",
            ">;"
        }
    .end annotation
.end method

.method public native ۥ۟۟ۡۢ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;",
            ">;"
        }
    .end annotation
.end method

.method public final native ۥۣ۟۟ۡ(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;",
            ">;)V"
        }
    .end annotation
.end method

.method public final native ۥ۟۟ۡۤ(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;",
            ">;)V"
        }
    .end annotation
.end method

.method public native ۥ۟۟ۡۥ(Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public native ۥ۟۟ۡۦ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
.end method
