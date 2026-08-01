.class public final synthetic Lka0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Lm80;

.field public final synthetic γ:Landroid/widget/CompoundButton;


# direct methods
.method public synthetic constructor <init>(Lm80;Landroid/widget/CompoundButton;I)V
    .locals 0

    .line 1
    iput p3, p0, Lka0;->α:I

    .line 2
    .line 3
    iput-object p1, p0, Lka0;->β:Lm80;

    .line 4
    .line 5
    iput-object p2, p0, Lka0;->γ:Landroid/widget/CompoundButton;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 1
    iget v0, p0, Lka0;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lka0;->β:Lm80;

    .line 7
    .line 8
    check-cast v0, Le80;

    .line 9
    .line 10
    iget-object p0, p0, Lka0;->γ:Landroid/widget/CompoundButton;

    .line 11
    .line 12
    check-cast p0, Landroid/widget/Switch;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {v0, p1, p0}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    iget-object v0, p0, Lka0;->β:Lm80;

    .line 26
    .line 27
    check-cast v0, Lcom/example/dyhelper/ui/ν;

    .line 28
    .line 29
    iget-object p0, p0, Lka0;->γ:Landroid/widget/CompoundButton;

    .line 30
    .line 31
    check-cast p0, Landroid/widget/CheckBox;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance p1, Lx90;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-direct {p1, p2, p0}, Lx90;-><init>(ZZ)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p1}, Lcom/example/dyhelper/ui/ν;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_1
    iget-object v0, p0, Lka0;->β:Lm80;

    .line 50
    .line 51
    check-cast v0, Lcom/example/dyhelper/ui/ν;

    .line 52
    .line 53
    iget-object p0, p0, Lka0;->γ:Landroid/widget/CompoundButton;

    .line 54
    .line 55
    check-cast p0, Landroid/widget/CheckBox;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    new-instance p1, Lx90;

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    invoke-direct {p1, p0, p2}, Lx90;-><init>(ZZ)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p1}, Lcom/example/dyhelper/ui/ν;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
