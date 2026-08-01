.class Lcom/mr/elaris/InAppSettingsMottoAudioPlayer$1;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;-><init>(Lcom/mr/elaris/InAppSettings;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer$1;->this$0:Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAudioFocusChange(I)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, -0x2

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    return-void

    .line 9
    :cond_1
    :goto_0
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer$1;->this$0:Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->release()V

    .line 12
    .line 13
    .line 14
    return-void
.end method
