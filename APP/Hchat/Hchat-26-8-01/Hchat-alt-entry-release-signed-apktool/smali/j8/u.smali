.class public final synthetic Lj8/u;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lj8/w;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lj8/y;


# direct methods
.method public synthetic constructor <init>(Lj8/y;I)V
    .locals 0

    .line 1
    iput p2, p0, Lj8/u;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lj8/u;->b:Lj8/y;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()Z
    .locals 3

    .line 1
    iget v0, p0, Lj8/u;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj8/u;->b:Lj8/y;

    .line 7
    .line 8
    invoke-virtual {v0}, Lj8/y;->u()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :pswitch_0
    iget-object v0, p0, Lj8/u;->b:Lj8/y;

    .line 14
    .line 15
    iget-object v1, v0, Lj8/y;->a:Lh/Hchat/dexkit/DexFinder;

    .line 16
    .line 17
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->voicePlaybackPauseMethod:Ljava/lang/reflect/Method;

    .line 18
    .line 19
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 20
    .line 21
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v1, v2}, Lj8/y;->l(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0

    .line 30
    :pswitch_1
    iget-object v0, p0, Lj8/u;->b:Lj8/y;

    .line 31
    .line 32
    iget-object v1, v0, Lj8/y;->a:Lh/Hchat/dexkit/DexFinder;

    .line 33
    .line 34
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->voicePlaybackResumeMethod:Ljava/lang/reflect/Method;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    new-array v2, v2, [Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Lj8/y;->l(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    return v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
