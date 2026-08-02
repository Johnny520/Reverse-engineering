.class public final Lia0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lzj0;


# instance fields
.field public final h:Lzj0;


# direct methods
.method public constructor <init>(Lzj0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lia0;->h:Lzj0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lak0;Lt00;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lo72;

    .line 2
    .line 3
    invoke-direct {v0}, Lo72;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lup0;->e:Lhh1;

    .line 7
    .line 8
    iput-object v1, v0, Lo72;->i:Ljava/lang/Object;

    .line 9
    .line 10
    new-instance v1, Lha0;

    .line 11
    .line 12
    invoke-direct {v1, p0, v0, p1}, Lha0;-><init>(Lia0;Lo72;Lak0;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lia0;->h:Lzj0;

    .line 16
    .line 17
    invoke-interface {p0, v1, p2}, Lzj0;->a(Lak0;Lt00;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object p1, Lk20;->h:Lk20;

    .line 22
    .line 23
    if-ne p0, p1, :cond_0

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    sget-object p0, La83;->a:La83;

    .line 27
    .line 28
    return-object p0
.end method
