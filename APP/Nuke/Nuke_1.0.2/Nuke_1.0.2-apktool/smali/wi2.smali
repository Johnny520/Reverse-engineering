.class public final Lwi2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final d:Ljava/util/Set;


# instance fields
.field public final a:Lj51;

.field public final b:Lc20;

.field public final c:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, ".nuke-staging"

    .line 2
    .line 3
    const-string v1, ".nuke-backup"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lwi2;->d:Ljava/util/Set;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lc20;I)V
    .locals 2

    .line 1
    new-instance v0, Lj51;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lj51;-><init>(I)V

    .line 6
    .line 7
    .line 8
    and-int/lit8 p3, p3, 0x4

    .line 9
    .line 10
    if-eqz p3, :cond_0

    .line 11
    .line 12
    sget-object p2, Lo90;->a:Lc60;

    .line 13
    .line 14
    sget-object p2, Lt50;->j:Lt50;

    .line 15
    .line 16
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lwi2;->a:Lj51;

    .line 23
    .line 24
    iput-object p2, p0, Lwi2;->b:Lc20;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lwi2;->c:Ljava/io/File;

    .line 34
    .line 35
    return-void
.end method
