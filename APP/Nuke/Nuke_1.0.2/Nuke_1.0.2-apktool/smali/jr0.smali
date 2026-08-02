.class public final Ljr0;
.super Lw00;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Lir0;


# direct methods
.method public constructor <init>(Lir0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljr0;->a:Lir0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/reflect/Type;)Lx00;
    .locals 1

    .line 1
    new-instance v0, Lj63;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lj63;-><init>(Ljava/lang/reflect/Type;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ljr0;->a:Lir0;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lir0;->c(Lj63;)Lq43;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance v0, Lkr0;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1}, Lkr0;-><init>(Lir0;Lq43;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final b(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lcj;)Lx00;
    .locals 0

    .line 1
    new-instance p2, Lj63;

    .line 2
    .line 3
    invoke-direct {p2, p1}, Lj63;-><init>(Ljava/lang/reflect/Type;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ljr0;->a:Lir0;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lir0;->c(Lj63;)Lq43;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance p2, Ln4;

    .line 13
    .line 14
    invoke-direct {p2, p0, p1}, Ln4;-><init>(Lir0;Lq43;)V

    .line 15
    .line 16
    .line 17
    return-object p2
.end method
