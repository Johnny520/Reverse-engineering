.class public final Lwi;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lqm0;
.implements Lnk;


# static fields
.field public static final e:Lr3;


# instance fields
.field public final d:Lpi;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr3;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lr3;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lwi;->e:Lr3;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lpi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwi;->d:Lpi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Integer;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lwi;->d:Lpi;

    .line 2
    .line 3
    invoke-virtual {p0}, Lpi;->E()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getKey()Lok;
    .locals 0

    .line 1
    sget-object p0, Lwi;->e:Lr3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final bridge h(Lpk;)Lpk;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lpf1;->J(Lnk;Lpk;)Lpk;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge l(Lok;)Lnk;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lpf1;->v(Lnk;Lok;)Lnk;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final p(Lww;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p2, p0}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge t(Lok;)Lpk;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lpf1;->F(Lnk;Lok;)Lpk;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
