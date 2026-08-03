.class public final synthetic Le9/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/media/Ringtone;


# direct methods
.method public synthetic constructor <init>(Landroid/media/Ringtone;I)V
    .locals 0

    .line 1
    iput p2, p0, Le9/g;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Le9/g;->h:Landroid/media/Ringtone;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Le9/g;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le9/g;->h:Landroid/media/Ringtone;

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {v0}, Landroid/media/Ringtone;->isPlaying()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/media/Ringtone;->stop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    :catchall_0
    :cond_0
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Le9/g;->h:Landroid/media/Ringtone;

    .line 19
    .line 20
    :try_start_1
    invoke-virtual {v0}, Landroid/media/Ringtone;->isPlaying()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/media/Ringtone;->stop()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    .line 28
    .line 29
    :catchall_1
    :cond_1
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
