.class public final Lb52;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lcom/dokar/quickjs/QuickJs;


# direct methods
.method public synthetic constructor <init>(Lcom/dokar/quickjs/QuickJs;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb52;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lb52;->i:Lcom/dokar/quickjs/QuickJs;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lb52;->h:I

    .line 2
    .line 3
    iget-object p0, p0, Lb52;->i:Lcom/dokar/quickjs/QuickJs;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/dokar/quickjs/QuickJs;->getTypeConverters()Lz53;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0}, Lcom/dokar/quickjs/QuickJs;->getTypeConverters()Lz53;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0, p1}, Lte;->n0(Lz53;Ljava/lang/Object;)Lh63;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {}, Ld72;->b()Lh63;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, p1, p0, v1}, Lz53;->a(Ljava/lang/Object;Lh63;Lh63;)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_0
    invoke-virtual {p0}, Lcom/dokar/quickjs/QuickJs;->getTypeConverters()Lz53;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0}, Lcom/dokar/quickjs/QuickJs;->getTypeConverters()Lz53;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0, p1}, Lte;->n0(Lz53;Ljava/lang/Object;)Lh63;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {}, Ld72;->b()Lh63;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, p1, p0, v1}, Lz53;->a(Ljava/lang/Object;Lh63;Lh63;)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_1
    invoke-virtual {p0}, Lcom/dokar/quickjs/QuickJs;->getTypeConverters()Lz53;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p0}, Lcom/dokar/quickjs/QuickJs;->getTypeConverters()Lz53;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p0, p1}, Lte;->n0(Lz53;Ljava/lang/Object;)Lh63;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 64
    .line 65
    invoke-static {v1}, Ld72;->c(Ljava/lang/Class;)Lh63;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v0, p1, p0, v1}, Lz53;->a(Ljava/lang/Object;Lh63;Lh63;)V

    .line 70
    .line 71
    .line 72
    return-object p1

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
