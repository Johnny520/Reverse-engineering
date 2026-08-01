.class Lcom/mr/elaris/InAppSettingsMottoAudioPlayer$2;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->createPlayer()Landroid/media/MediaPlayer;
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
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer$2;->this$0:Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer$2;->this$0:Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->release()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
