.class public final Ljd1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lof1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lin0;

.field public final synthetic e:Lin0;

.field public final synthetic f:Lkd1;


# direct methods
.method public constructor <init>(IILjava/util/Map;Lin0;Lin0;Lkd1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ljd1;->a:I

    .line 5
    .line 6
    iput p2, p0, Ljd1;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Ljd1;->c:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p4, p0, Ljd1;->d:Lin0;

    .line 11
    .line 12
    iput-object p5, p0, Ljd1;->e:Lin0;

    .line 13
    .line 14
    iput-object p6, p0, Ljd1;->f:Lkd1;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Ljd1;->c:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Ljd1;->f:Lkd1;

    .line 2
    .line 3
    iget-object v0, v0, Lkd1;->s:Lld1;

    .line 4
    .line 5
    iget-object p0, p0, Ljd1;->e:Lin0;

    .line 6
    .line 7
    invoke-interface {p0, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final c()I
    .locals 0

    .line 1
    iget p0, p0, Ljd1;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public final d()Lin0;
    .locals 0

    .line 1
    iget-object p0, p0, Ljd1;->d:Lin0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()I
    .locals 0

    .line 1
    iget p0, p0, Ljd1;->a:I

    .line 2
    .line 3
    return p0
.end method
