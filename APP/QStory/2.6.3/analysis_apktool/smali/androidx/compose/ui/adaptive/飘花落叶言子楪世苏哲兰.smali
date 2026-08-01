.class public final Landroidx/compose/ui/adaptive/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/hardware/input/InputManager$InputDeviceListener;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:Landroid/hardware/input/InputManager;


# direct methods
.method public constructor <init>(Landroid/hardware/input/InputManager;Landroidx/compose/ui/adaptive/飘花落叶言子楪世哲兰苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/adaptive/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/hardware/input/InputManager;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onInputDeviceAdded(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/adaptive/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final onInputDeviceChanged(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/adaptive/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final onInputDeviceRemoved(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/adaptive/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 7

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/adaptive/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/hardware/input/InputManager;

    .line 2
    .line 3
    if-eqz p0, :cond_4

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/hardware/input/InputManager;->getInputDeviceIds()[I

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    array-length v1, v0

    .line 10
    const-string v2, "None"

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    move-object v4, v2

    .line 14
    :goto_0
    if-ge v3, v1, :cond_4

    .line 15
    .line 16
    aget v5, v0, v3

    .line 17
    .line 18
    invoke-virtual {p0, v5}, Landroid/hardware/input/InputManager;->getInputDevice(I)Landroid/view/InputDevice;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const/16 v6, 0x2002

    .line 26
    .line 27
    invoke-static {v5, v6}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子世兰哲楪苏(Landroid/view/InputDevice;I)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-nez v6, :cond_4

    .line 32
    .line 33
    const/16 v6, 0x4002

    .line 34
    .line 35
    invoke-static {v5, v6}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子世兰哲楪苏(Landroid/view/InputDevice;I)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-nez v6, :cond_4

    .line 40
    .line 41
    const v6, 0x100008

    .line 42
    .line 43
    .line 44
    invoke-static {v5, v6}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子世兰哲楪苏(Landroid/view/InputDevice;I)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-nez v6, :cond_4

    .line 49
    .line 50
    const/16 v6, 0x1002

    .line 51
    .line 52
    invoke-static {v5, v6}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子世兰哲楪苏(Landroid/view/InputDevice;I)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_1

    .line 57
    .line 58
    const-string v4, "Coarse"

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-virtual {v4, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_3

    .line 66
    .line 67
    const v6, 0x1000010

    .line 68
    .line 69
    .line 70
    invoke-static {v5, v6}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子世兰哲楪苏(Landroid/view/InputDevice;I)Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-nez v6, :cond_2

    .line 75
    .line 76
    const/16 v6, 0x401

    .line 77
    .line 78
    invoke-static {v5, v6}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子世兰哲楪苏(Landroid/view/InputDevice;I)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_3

    .line 83
    .line 84
    :cond_2
    const-string v4, "Blunt"

    .line 85
    .line 86
    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    const/4 p0, 0x0

    .line 90
    throw p0
.end method
