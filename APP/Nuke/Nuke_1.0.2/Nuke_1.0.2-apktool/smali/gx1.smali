.class public final Lgx1;
.super Lop0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final h:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgx1;->h:Ljava/lang/Class;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final j(Lr82;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object p1, p1, Lr82;->e:Lcj;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lgx1;->h:Ljava/lang/Class;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object v0, p1, Lcj;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lp40;

    .line 18
    .line 19
    invoke-virtual {v0, p0, p2}, Lp40;->P(Lbt;Ljava/lang/Object;)Lp40;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iput-object p0, p1, Lcj;->e:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
.end method
