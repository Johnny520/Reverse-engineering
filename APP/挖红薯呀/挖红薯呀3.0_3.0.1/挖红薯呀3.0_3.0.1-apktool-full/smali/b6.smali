.class public final synthetic Lb6;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lyw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lb6;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Lb6;->e:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lb6;->d:I

    .line 2
    .line 3
    iget-object p0, p0, Lb6;->e:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ljava/util/List;

    .line 9
    .line 10
    check-cast p1, Lx60;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    check-cast p3, Lji;

    .line 19
    .line 20
    check-cast p4, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p4

    .line 26
    invoke-static {p0, p1, p2, p3, p4}, Lzc0;->x(Ljava/util/List;Lx60;ILji;I)Lna1;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p0, Lc6;

    .line 32
    .line 33
    check-cast p1, Lz51;

    .line 34
    .line 35
    check-cast p2, Lzv;

    .line 36
    .line 37
    check-cast p3, Lxv;

    .line 38
    .line 39
    check-cast p4, Lyv;

    .line 40
    .line 41
    iget-object v0, p0, Lc6;->e:Ljv;

    .line 42
    .line 43
    iget p3, p3, Lxv;->a:I

    .line 44
    .line 45
    iget p4, p4, Lyv;->a:I

    .line 46
    .line 47
    check-cast v0, Lkv;

    .line 48
    .line 49
    invoke-virtual {v0, p1, p2, p3, p4}, Lkv;->b(Lz51;Lzv;II)Lba1;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    instance-of p2, p1, Lba1;

    .line 54
    .line 55
    if-nez p2, :cond_0

    .line 56
    .line 57
    new-instance p2, Lo8;

    .line 58
    .line 59
    iget-object p3, p0, Lc6;->j:Lo8;

    .line 60
    .line 61
    invoke-direct {p2, p1, p3}, Lo8;-><init>(Lba1;Lo8;)V

    .line 62
    .line 63
    .line 64
    iput-object p2, p0, Lc6;->j:Lo8;

    .line 65
    .line 66
    iget-object p0, p2, Lo8;->c:Ljava/lang/Object;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    check-cast p0, Landroid/graphics/Typeface;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    iget-object p0, p1, Lba1;->d:Ljava/lang/Object;

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    check-cast p0, Landroid/graphics/Typeface;

    .line 80
    .line 81
    :goto_0
    return-object p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
