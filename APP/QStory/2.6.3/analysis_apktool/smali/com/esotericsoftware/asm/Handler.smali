.class Lcom/esotericsoftware/asm/Handler;
.super Ljava/lang/Object;


# instance fields
.field a:Lcom/esotericsoftware/asm/Label;

.field b:Lcom/esotericsoftware/asm/Label;

.field c:Lcom/esotericsoftware/asm/Label;

.field d:Ljava/lang/String;

.field e:I

.field f:Lcom/esotericsoftware/asm/Handler;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Lcom/esotericsoftware/asm/Handler;Lcom/esotericsoftware/asm/Label;Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Handler;
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/asm/Handler;->f:Lcom/esotericsoftware/asm/Handler;

    .line 6
    .line 7
    invoke-static {v0, p1, p2}, Lcom/esotericsoftware/asm/Handler;->a(Lcom/esotericsoftware/asm/Handler;Lcom/esotericsoftware/asm/Label;Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Handler;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/esotericsoftware/asm/Handler;->f:Lcom/esotericsoftware/asm/Handler;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/esotericsoftware/asm/Handler;->a:Lcom/esotericsoftware/asm/Label;

    .line 14
    .line 15
    iget v1, v1, Lcom/esotericsoftware/asm/Label;->c:I

    .line 16
    .line 17
    iget-object v2, p0, Lcom/esotericsoftware/asm/Handler;->b:Lcom/esotericsoftware/asm/Label;

    .line 18
    .line 19
    iget v2, v2, Lcom/esotericsoftware/asm/Label;->c:I

    .line 20
    .line 21
    iget v3, p1, Lcom/esotericsoftware/asm/Label;->c:I

    .line 22
    .line 23
    if-nez p2, :cond_1

    .line 24
    .line 25
    const v4, 0x7fffffff

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget v4, p2, Lcom/esotericsoftware/asm/Label;->c:I

    .line 30
    .line 31
    :goto_0
    if-ge v3, v2, :cond_5

    .line 32
    .line 33
    if-le v4, v1, :cond_5

    .line 34
    .line 35
    if-gt v3, v1, :cond_3

    .line 36
    .line 37
    if-lt v4, v2, :cond_2

    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_2
    iput-object p2, p0, Lcom/esotericsoftware/asm/Handler;->a:Lcom/esotericsoftware/asm/Label;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_3
    if-lt v4, v2, :cond_4

    .line 44
    .line 45
    iput-object p1, p0, Lcom/esotericsoftware/asm/Handler;->b:Lcom/esotericsoftware/asm/Label;

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_4
    new-instance v0, Lcom/esotericsoftware/asm/Handler;

    .line 49
    .line 50
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Handler;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p2, v0, Lcom/esotericsoftware/asm/Handler;->a:Lcom/esotericsoftware/asm/Label;

    .line 54
    .line 55
    iget-object p2, p0, Lcom/esotericsoftware/asm/Handler;->b:Lcom/esotericsoftware/asm/Label;

    .line 56
    .line 57
    iput-object p2, v0, Lcom/esotericsoftware/asm/Handler;->b:Lcom/esotericsoftware/asm/Label;

    .line 58
    .line 59
    iget-object p2, p0, Lcom/esotericsoftware/asm/Handler;->c:Lcom/esotericsoftware/asm/Label;

    .line 60
    .line 61
    iput-object p2, v0, Lcom/esotericsoftware/asm/Handler;->c:Lcom/esotericsoftware/asm/Label;

    .line 62
    .line 63
    iget-object p2, p0, Lcom/esotericsoftware/asm/Handler;->d:Ljava/lang/String;

    .line 64
    .line 65
    iput-object p2, v0, Lcom/esotericsoftware/asm/Handler;->d:Ljava/lang/String;

    .line 66
    .line 67
    iget p2, p0, Lcom/esotericsoftware/asm/Handler;->e:I

    .line 68
    .line 69
    iput p2, v0, Lcom/esotericsoftware/asm/Handler;->e:I

    .line 70
    .line 71
    iget-object p2, p0, Lcom/esotericsoftware/asm/Handler;->f:Lcom/esotericsoftware/asm/Handler;

    .line 72
    .line 73
    iput-object p2, v0, Lcom/esotericsoftware/asm/Handler;->f:Lcom/esotericsoftware/asm/Handler;

    .line 74
    .line 75
    iput-object p1, p0, Lcom/esotericsoftware/asm/Handler;->b:Lcom/esotericsoftware/asm/Label;

    .line 76
    .line 77
    iput-object v0, p0, Lcom/esotericsoftware/asm/Handler;->f:Lcom/esotericsoftware/asm/Handler;

    .line 78
    .line 79
    :cond_5
    return-object p0
.end method
