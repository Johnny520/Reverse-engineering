.class public final Lii0;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic k:Lji0;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lji0;II)V
    .locals 0

    .line 1
    iput p4, p0, Lii0;->i:I

    .line 2
    .line 3
    iput-object p1, p0, Lii0;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    iput-object p2, p0, Lii0;->k:Lji0;

    .line 6
    .line 7
    iput p3, p0, Lii0;->l:I

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lii0;->i:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget v3, p0, Lii0;->l:I

    .line 6
    .line 7
    iget-object v4, p0, Lii0;->k:Lji0;

    .line 8
    .line 9
    iget-object p0, p0, Lii0;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget v0, v4, Lji0;->l:I

    .line 15
    .line 16
    invoke-static {v3, v0}, Lsj;->f(II)J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    new-array v0, v2, [J

    .line 21
    .line 22
    aput-wide v3, v0, v1

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->D([J)Lws;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ltj;->first()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Lus;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_0
    iget v0, v4, Lji0;->i:I

    .line 36
    .line 37
    invoke-static {v3, v0}, Lsj;->f(II)J

    .line 38
    .line 39
    .line 40
    move-result-wide v3

    .line 41
    new-array v0, v2, [J

    .line 42
    .line 43
    aput-wide v3, v0, v1

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->D([J)Lws;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ltj;->first()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Lus;

    .line 54
    .line 55
    return-object p0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
