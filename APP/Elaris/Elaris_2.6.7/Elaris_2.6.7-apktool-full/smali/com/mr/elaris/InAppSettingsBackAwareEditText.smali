.class Lcom/mr/elaris/InAppSettingsBackAwareEditText;
.super Landroid/widget/EditText;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field private final settings:Lcom/mr/elaris/InAppSettings;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsBackAwareEditText;->settings:Lcom/mr/elaris/InAppSettings;

    .line 5
    .line 6
    return-void
.end method

.method private static isVolumeKey(I)Z
    .locals 1

    .line 1
    const/16 v0, 0x19

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x18

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method


# virtual methods
.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lcom/mr/elaris/InAppSettingsBackAwareEditText;->isVolumeKey(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsBackAwareEditText;->settings:Lcom/mr/elaris/InAppSettings;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p0}, Lcom/mr/elaris/InAppSettings;->handleVolumeKey(Landroid/view/KeyEvent;Landroid/view/View;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public onKeyPreIme(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/mr/elaris/InAppSettingsBackAwareEditText;->isVolumeKey(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsBackAwareEditText;->settings:Lcom/mr/elaris/InAppSettings;

    .line 8
    .line 9
    invoke-virtual {p1, p2, p0}, Lcom/mr/elaris/InAppSettings;->handleVolumeKey(Landroid/view/KeyEvent;Landroid/view/View;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 v0, 0x4

    .line 15
    if-ne p1, v0, :cond_3

    .line 16
    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 p2, 0x1

    .line 24
    if-ne p1, p2, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return p2

    .line 28
    :cond_2
    :goto_0
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsBackAwareEditText;->settings:Lcom/mr/elaris/InAppSettings;

    .line 29
    .line 30
    const-string p1, "inputPreIme"

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->consumeFocusedInputBackOnly(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :cond_3
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyPreIme(ILandroid/view/KeyEvent;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0
.end method
