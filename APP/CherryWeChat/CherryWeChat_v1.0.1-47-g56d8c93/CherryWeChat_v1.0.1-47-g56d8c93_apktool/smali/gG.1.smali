.class public abstract LgG;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:I = -0x1

.field public static b:Ljava/lang/String;

.field public static c:Ljava/lang/ClassLoader;

.field public static d:Ljava/lang/String;

.field public static e:Ljava/lang/String;

.field public static f:Landroid/content/pm/ApplicationInfo;

.field public static final g:Ljava/util/ArrayList;

.field public static h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-wide v0, -0x20d4cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LgG;->b:Ljava/lang/String;

    const-class v0, LfG;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    const-wide v0, -0x20d52fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-wide v1, -0x20d66fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    sput-object v0, LgG;->c:Ljava/lang/ClassLoader;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, LgG;->g:Ljava/util/ArrayList;

    return-void
.end method
