.class public final Lm43;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lbd0;


# instance fields
.field public final a:I

.field public final b:Lgd0;


# direct methods
.method public constructor <init>(ILgd0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lm43;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lm43;->b:Lgd0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ln43;)Lx93;
    .locals 1

    .line 1
    new-instance p1, Ldk;

    .line 2
    .line 3
    iget v0, p0, Lm43;->a:I

    .line 4
    .line 5
    iget-object p0, p0, Lm43;->b:Lgd0;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0}, Ldk;-><init>(ILgd0;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final a(Ln43;)Lz93;
    .locals 1

    .line 11
    new-instance p1, Ldk;

    iget v0, p0, Lm43;->a:I

    iget-object p0, p0, Lm43;->b:Lgd0;

    invoke-direct {p1, v0, p0}, Ldk;-><init>(ILgd0;)V

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lm43;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lm43;

    .line 6
    .line 7
    iget v0, p1, Lm43;->a:I

    .line 8
    .line 9
    iget v1, p0, Lm43;->a:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, Lm43;->b:Lgd0;

    .line 14
    .line 15
    iget-object p0, p0, Lm43;->b:Lgd0;

    .line 16
    .line 17
    invoke-static {p1, p0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lm43;->a:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-object p0, p0, Lm43;->b:Lgd0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    add-int/2addr p0, v0

    .line 12
    mul-int/lit8 p0, p0, 0x1f

    .line 13
    .line 14
    return p0
.end method
