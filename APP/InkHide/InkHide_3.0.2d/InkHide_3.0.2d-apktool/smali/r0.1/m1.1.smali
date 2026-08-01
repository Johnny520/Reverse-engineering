.class public final synthetic Lr0/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/t1;

.field public final synthetic c:Ljava/lang/reflect/Method;


# direct methods
.method public synthetic constructor <init>(Lr0/t1;Ljava/lang/reflect/Method;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr0/m1;->a:I

    iput-object p1, p0, Lr0/m1;->b:Lr0/t1;

    iput-object p2, p0, Lr0/m1;->c:Ljava/lang/reflect/Method;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lr0/m1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lr0/s1;

    .line 7
    .line 8
    iget-object v1, p0, Lr0/m1;->b:Lr0/t1;

    .line 9
    .line 10
    iget-object v2, p0, Lr0/m1;->c:Ljava/lang/reflect/Method;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v0, v1, v2, v3}, Lr0/s1;-><init>(Lr0/t1;Ljava/lang/reflect/Method;I)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Lr0/s1;

    .line 18
    .line 19
    iget-object v1, p0, Lr0/m1;->b:Lr0/t1;

    .line 20
    .line 21
    iget-object v2, p0, Lr0/m1;->c:Ljava/lang/reflect/Method;

    .line 22
    .line 23
    const/4 v3, 0x4

    .line 24
    invoke-direct {v0, v1, v2, v3}, Lr0/s1;-><init>(Lr0/t1;Ljava/lang/reflect/Method;I)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_1
    new-instance v0, Lr0/s1;

    .line 29
    .line 30
    iget-object v1, p0, Lr0/m1;->c:Ljava/lang/reflect/Method;

    .line 31
    .line 32
    iget-object v2, p0, Lr0/m1;->b:Lr0/t1;

    .line 33
    .line 34
    const/4 v3, 0x3

    .line 35
    invoke-direct {v0, v2, v1, v3}, Lr0/s1;-><init>(Lr0/t1;Ljava/lang/reflect/Method;I)V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_2
    new-instance v0, Lr0/s1;

    .line 40
    .line 41
    iget-object v1, p0, Lr0/m1;->b:Lr0/t1;

    .line 42
    .line 43
    iget-object v2, p0, Lr0/m1;->c:Ljava/lang/reflect/Method;

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-direct {v0, v1, v2, v3}, Lr0/s1;-><init>(Lr0/t1;Ljava/lang/reflect/Method;I)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :pswitch_3
    new-instance v0, Lr0/s1;

    .line 51
    .line 52
    iget-object v1, p0, Lr0/m1;->c:Ljava/lang/reflect/Method;

    .line 53
    .line 54
    iget-object v2, p0, Lr0/m1;->b:Lr0/t1;

    .line 55
    .line 56
    const/4 v3, 0x5

    .line 57
    invoke-direct {v0, v2, v1, v3}, Lr0/s1;-><init>(Lr0/t1;Ljava/lang/reflect/Method;I)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :pswitch_4
    new-instance v0, Lr0/s1;

    .line 62
    .line 63
    iget-object v1, p0, Lr0/m1;->b:Lr0/t1;

    .line 64
    .line 65
    iget-object v2, p0, Lr0/m1;->c:Ljava/lang/reflect/Method;

    .line 66
    .line 67
    const/4 v3, 0x2

    .line 68
    invoke-direct {v0, v1, v2, v3}, Lr0/s1;-><init>(Lr0/t1;Ljava/lang/reflect/Method;I)V

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
