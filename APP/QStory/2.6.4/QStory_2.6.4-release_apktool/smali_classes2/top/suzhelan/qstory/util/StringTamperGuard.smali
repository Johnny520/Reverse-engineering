.class public final Ltop/suzhelan/qstory/util/StringTamperGuard;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000c\u001a\u00020\u0005H\u0087 b\u0002\u0008\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u0005H\u0087 b\u0002\u0008\rJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\tR\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00ca\u0001\u000c\u0008\u0013\u0012\u0008\u0008\u0014\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u0012"
    }
    d2 = {
        "Ltop/suzhelan/qstory/util/StringTamperGuard;",
        "",
        "<init>",
        "()V",
        "appClassLoader",
        "Ljava/lang/ClassLoader;",
        "getAppClassLoader",
        "()Ljava/lang/ClassLoader;",
        "decryptGuarded",
        "",
        "data",
        "key",
        "loader",
        "Lkotlin/jvm/JvmStatic;",
        "isTampered",
        "",
        "decrypt",
        "",
        "QStory:app_publishRelease",
        "Landroidx/compose/runtime/internal/StabilityInferred;",
        "parameters"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Ltop/suzhelan/qstory/util/StringTamperGuard;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ltop/suzhelan/qstory/util/StringTamperGuard;

    .line 2
    .line 3
    invoke-direct {v0}, Ltop/suzhelan/qstory/util/StringTamperGuard;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltop/suzhelan/qstory/util/StringTamperGuard;->INSTANCE:Ltop/suzhelan/qstory/util/StringTamperGuard;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final native decryptGuarded([B[BLjava/lang/ClassLoader;)[B
.end method

.method private final getAppClassLoader()Ljava/lang/ClassLoader;
    .locals 0

    .line 1
    const-class p0, Ltop/suzhelan/qstory/util/StringTamperGuard;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public static final native isTampered(Ljava/lang/ClassLoader;)Z
.end method


# virtual methods
.method public final decrypt([B[B)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ltop/suzhelan/qstory/util/StringTamperGuard;->getAppClassLoader()Ljava/lang/ClassLoader;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p1, p2, p0}, Ltop/suzhelan/qstory/util/StringTamperGuard;->decryptGuarded([B[BLjava/lang/ClassLoader;)[B

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance p2, Ljava/lang/String;

    .line 18
    .line 19
    invoke-direct {p2, p0, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 20
    .line 21
    .line 22
    return-object p2
.end method
