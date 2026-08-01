.class public final synthetic Lrd1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Lqm1;

.field public final synthetic γ:Ljava/util/LinkedHashMap;

.field public final synthetic δ:Lum1;

.field public final synthetic ε:Landroid/widget/RadioGroup;

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Lxx;


# direct methods
.method public synthetic constructor <init>(Lqm1;Ljava/util/LinkedHashMap;Lum1;Landroid/widget/RadioGroup;Landroid/app/Activity;Lxx;I)V
    .locals 0

    .line 1
    iput p7, p0, Lrd1;->α:I

    .line 2
    .line 3
    iput-object p1, p0, Lrd1;->β:Lqm1;

    .line 4
    .line 5
    iput-object p2, p0, Lrd1;->γ:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    iput-object p3, p0, Lrd1;->δ:Lum1;

    .line 8
    .line 9
    iput-object p4, p0, Lrd1;->ε:Landroid/widget/RadioGroup;

    .line 10
    .line 11
    iput-object p5, p0, Lrd1;->ζ:Landroid/app/Activity;

    .line 12
    .line 13
    iput-object p6, p0, Lrd1;->η:Lxx;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 1

    .line 1
    iget v0, p0, Lrd1;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lrd1;->β:Lqm1;

    .line 10
    .line 11
    iget-boolean p1, p1, Lqm1;->ε:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v0, p0, Lrd1;->γ:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Ljava/lang/String;

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lrd1;->δ:Lum1;

    .line 31
    .line 32
    iput-object p1, v0, Lum1;->ε:Ljava/lang/Object;

    .line 33
    .line 34
    iget-object p1, p0, Lrd1;->ε:Landroid/widget/RadioGroup;

    .line 35
    .line 36
    iget-object v0, p0, Lrd1;->ζ:Landroid/app/Activity;

    .line 37
    .line 38
    iget-object p0, p0, Lrd1;->η:Lxx;

    .line 39
    .line 40
    invoke-static {p1, v0, p0, p2}, Lpf1;->ι(Landroid/widget/RadioGroup;Landroid/app/Activity;Lxx;I)V

    .line 41
    .line 42
    .line 43
    :cond_1
    :goto_0
    return-void

    .line 44
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lrd1;->β:Lqm1;

    .line 48
    .line 49
    iget-boolean p1, p1, Lqm1;->ε:Z

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object v0, p0, Lrd1;->γ:Ljava/util/LinkedHashMap;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Lud1;

    .line 65
    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    iget-object p1, p1, Lud1;->α:Lvd1;

    .line 69
    .line 70
    iget-object v0, p0, Lrd1;->δ:Lum1;

    .line 71
    .line 72
    iput-object p1, v0, Lum1;->ε:Ljava/lang/Object;

    .line 73
    .line 74
    iget-object p1, p0, Lrd1;->ε:Landroid/widget/RadioGroup;

    .line 75
    .line 76
    iget-object v0, p0, Lrd1;->ζ:Landroid/app/Activity;

    .line 77
    .line 78
    iget-object p0, p0, Lrd1;->η:Lxx;

    .line 79
    .line 80
    invoke-static {p1, v0, p0, p2}, Lxd1;->π(Landroid/widget/RadioGroup;Landroid/app/Activity;Lxx;I)V

    .line 81
    .line 82
    .line 83
    :cond_3
    :goto_1
    return-void

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
