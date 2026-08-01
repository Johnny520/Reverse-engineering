.class public final synthetic Lid2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lkr0;


# instance fields
.field public final synthetic α:Lun;


# direct methods
.method public constructor <init>(Lun;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lid2;->α:Lun;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 9

    .line 1
    instance-of v0, p1, Lkr0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v0, p1, Lid2;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lp80;

    .line 10
    .line 11
    const-string v6, "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;"

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    iget-object v3, p0, Lid2;->α:Lun;

    .line 16
    .line 17
    const-class v4, Lun;

    .line 18
    .line 19
    const-string v5, "scheduleFrameEndCallback"

    .line 20
    .line 21
    invoke-direct/range {v1 .. v7}, Lo80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    check-cast p1, Lid2;

    .line 25
    .line 26
    new-instance v2, Lp80;

    .line 27
    .line 28
    iget-object v4, p1, Lid2;->α:Lun;

    .line 29
    .line 30
    const-string v7, "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;"

    .line 31
    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v3, 0x1

    .line 34
    const-class v5, Lun;

    .line 35
    .line 36
    const-string v6, "scheduleFrameEndCallback"

    .line 37
    .line 38
    invoke-direct/range {v2 .. v8}, Lo80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Lo80;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    :cond_0
    const/4 p0, 0x0

    .line 47
    return p0
.end method

.method public final hashCode()I
    .locals 7

    .line 1
    new-instance v0, Lp80;

    .line 2
    .line 3
    const-string v5, "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;"

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    iget-object v2, p0, Lid2;->α:Lun;

    .line 8
    .line 9
    const-class v3, Lun;

    .line 10
    .line 11
    const-string v4, "scheduleFrameEndCallback"

    .line 12
    .line 13
    invoke-direct/range {v0 .. v6}, Lo80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lo80;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method
