.class public abstract Lgf0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lym1;

.field public static final β:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lym1;

    .line 2
    .line 3
    const-string v1, "((?:\u4e0a\u6ed1|\u4e0b\u6ed1)?\u677e\u624b\u9501\u5b9a\\s*)\\d+(?:\\.\\d+)?(\\s*\u500d\u901f)"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lym1;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lgf0;->α:Lym1;

    .line 9
    .line 10
    const-string v0, "~78D771E8EDF777FCD63305F705F385C32437F8A58A06E57B236CBE52EE80690C87062CCF8375AD4388FCF0F5F78DB89E313078C0432356E4724AD1766356CFE4EE7D09AF8F5E60784E408CC10DD2631F"

    .line 11
    .line 12
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "~789B0C8A27824271C64AC17B4A4EFA968DD58C04A0DDDC0007C199DECD27750A6CE3CA9CF0D42D6F95D7AB5C0BEEB31080B8919C78B92996123DC5E75A5109F5A997E8"

    .line 17
    .line 18
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lgf0;->β:Ljava/util/List;

    .line 31
    .line 32
    return-void
.end method

.method public static α()I
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    :try_start_0
    invoke-static {}, Lui1;->Α()Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    :catchall_0
    move v1, v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v1, "host_long_press_speed"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    .line 12
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v2, v1, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 17
    .line 18
    .line 19
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    :goto_0
    :try_start_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 24
    goto :goto_1

    .line 25
    :catchall_1
    move-exception v1

    .line 26
    new-instance v2, Leo1;

    .line 27
    .line 28
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    move-object v1, v2

    .line 32
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    instance-of v2, v1, Leo1;

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    move-object v1, v0

    .line 41
    :cond_1
    check-cast v1, Ljava/lang/Number;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const/4 v1, 0x1

    .line 48
    const/4 v2, 0x5

    .line 49
    invoke-static {v0, v1, v2}, Lj81;->μ(III)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    return v0
.end method
