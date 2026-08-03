.class public LYue/ۥ۟ۦۦۨ;
.super Ljava/lang/Object;


# static fields
.field public static final ۥ:Ljava/lang/String;

.field public static final ۥ۟:Ljava/lang/String;

.field public static final ۥ۟۟:Ljava/lang/String;

.field public static ۥ۟۟۟:Lorg/json/JSONObject;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۡ:Ljava/lang/String;

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


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x3f0

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥ۟ۦۦۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۦۦۨ;->ۥ:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۤ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xc

    invoke-static {v1}, LYue/ۥ۟ۦۦۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۦۦۨ;->ۥ۟:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0xd

    invoke-static {v2}, LYue/ۥ۟ۦۦۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, LYue/ۥ۟ۦۦۨ;->ۥ۟۟:Ljava/lang/String;

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_0
    invoke-static {}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟۟ۥ()Lorg/json/JSONObject;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۦۦۨ;->ۥ۟۟۟:Lorg/json/JSONObject;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ()V
.end method

.method public static native declared-synchronized ۥ۟(Ljava/lang/String;)Z
.end method

.method public static native ۥ۟۟(Ljava/lang/String;)Z
.end method

.method public static native ۥ۟۟۟(Ljava/lang/String;)F
.end method

.method public static native ۥ۟۟۟۟(Ljava/lang/String;)I
.end method

.method public static native ۥ۟۟۟۠(Ljava/lang/String;)J
.end method

.method public static native ۥ۟۟۟ۡ(Ljava/lang/String;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation
.end method

.method public static native ۥ۟۟۟ۢ(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native ۥۣ۟۟۟(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06e6\u06e5\u06df;",
            ">;)V"
        }
    .end annotation
.end method

.method public static native synthetic ۥ۟۟۟ۤ()V
.end method

.method public static native ۥ۟۟۟ۥ()Lorg/json/JSONObject;
.end method

.method public static native ۥ۟۟۟ۦ()Z
.end method

.method public static native declared-synchronized ۥ۟۟۟ۧ(Ljava/lang/String;Ljava/lang/Object;)Z
.end method
