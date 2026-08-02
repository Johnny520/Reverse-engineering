.class public final Lcy;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljv1;
.implements Ly10;


# static fields
.field public static final i:Lz8;


# instance fields
.field public final h:Lgo0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lz8;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lz8;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcy;->i:Lz8;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lgo0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcy;->h:Lgo0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Integer;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcy;->h:Lgo0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgo0;->E()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getKey()Lz10;
    .locals 0

    .line 1
    sget-object p0, Lcy;->i:Lz8;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcy;->h:Lgo0;

    .line 2
    .line 3
    iget-boolean p0, p0, Lgo0;->C:Z

    .line 4
    .line 5
    return p0
.end method

.method public final bridge k(La20;)La20;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxe1;->f0(Ly10;La20;)La20;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge o(Lz10;)Ly10;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxe1;->u(Ly10;Lz10;)Ly10;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final r(Lmn0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p2, p0}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge u(Lz10;)La20;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxe1;->W(Ly10;Lz10;)La20;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
