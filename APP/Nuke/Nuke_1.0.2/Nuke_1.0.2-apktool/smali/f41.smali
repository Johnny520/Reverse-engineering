.class public final Lf41;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lyo2;


# static fields
.field public static final b:Lf41;

.field public static final c:Ljava/lang/String;


# instance fields
.field public final synthetic a:Lgb1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lf41;

    .line 2
    .line 3
    invoke-direct {v0}, Lf41;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf41;->b:Lf41;

    .line 7
    .line 8
    const-string v0, "kotlinx.serialization.json.JsonObject"

    .line 9
    .line 10
    sput-object v0, Lf41;->c:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lnv2;->a:Lnv2;

    .line 5
    .line 6
    sget-object v0, Lo31;->a:Lo31;

    .line 7
    .line 8
    sget-object v0, Lnv2;->a:Lnv2;

    .line 9
    .line 10
    sget-object v0, Lo31;->a:Lo31;

    .line 11
    .line 12
    new-instance v0, Lgb1;

    .line 13
    .line 14
    sget-object v1, Lnv2;->b:Lg32;

    .line 15
    .line 16
    sget-object v2, Lo31;->b:Lap2;

    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lgb1;-><init>(Lyo2;Lyo2;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lf41;->a:Lgb1;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lf41;->a:Lgb1;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lgb1;->a(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lf41;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()Ls11;
    .locals 0

    .line 1
    iget-object p0, p0, Lf41;->a:Lgb1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lyv2;->i:Lyv2;

    .line 7
    .line 8
    return-object p0
.end method

.method public final d()I
    .locals 0

    .line 1
    iget-object p0, p0, Lf41;->a:Lgb1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x2

    .line 7
    return p0
.end method

.method public final e(I)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lf41;->a:Lgb1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final f()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lf41;->a:Lgb1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lf41;->a:Lgb1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lbe0;->h:Lbe0;

    .line 7
    .line 8
    return-object p0
.end method

.method public final h()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lf41;->a:Lgb1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0
.end method

.method public final i(I)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lf41;->a:Lgb1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lgb1;->i(I)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lbe0;->h:Lbe0;

    .line 7
    .line 8
    return-object p0
.end method

.method public final j(I)Lyo2;
    .locals 0

    .line 1
    iget-object p0, p0, Lf41;->a:Lgb1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lgb1;->j(I)Lyo2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final k(I)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lf41;->a:Lgb1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lgb1;->k(I)Z

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0
.end method
