.class public LYue/ۥ۟ۥۨۥ;
.super Ljava/lang/Object;


# static fields
.field public static final ۥ:Ljava/lang/String;

.field public static final ۥ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x257

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥ۟ۥۨۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۥۨۥ;->ۥ۟:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۤ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-static {v1}, LYue/ۥ۟ۥۨۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۥۨۥ;->ۥ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native ۥ(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native ۥ۟()Ljava/io/File;
.end method

.method public static native ۥ۟۟()Ljava/io/File;
.end method

.method public static native ۥ۟۟۟(Z)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/utils/entity/comment/CommentBean;",
            ">;"
        }
    .end annotation
.end method

.method public static native ۥ۟۟۟۟(Lcom/yuexin/panel/utils/entity/comment/CommentBean;)V
.end method
