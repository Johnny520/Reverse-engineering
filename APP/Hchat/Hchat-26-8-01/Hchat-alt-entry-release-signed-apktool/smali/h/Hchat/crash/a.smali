.class public final synthetic Lh/Hchat/crash/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lh/Hchat/crash/a;->g:I

    .line 2
    .line 3
    iput p1, p0, Lh/Hchat/crash/a;->h:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lh/Hchat/crash/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lh/Hchat/crash/a;->h:I

    .line 7
    .line 8
    check-cast p1, Landroid/app/ApplicationExitInfo;

    .line 9
    .line 10
    invoke-static {v0, p1}, Lh/Hchat/crash/CrashExitInfoApi30;->b(ILandroid/app/ApplicationExitInfo;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :pswitch_0
    iget v0, p0, Lh/Hchat/crash/a;->h:I

    .line 20
    .line 21
    check-cast p1, Landroid/app/ApplicationExitInfo;

    .line 22
    .line 23
    invoke-static {v0, p1}, Lh/Hchat/crash/CrashExitInfoApi30;->d(ILandroid/app/ApplicationExitInfo;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    goto :goto_0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
