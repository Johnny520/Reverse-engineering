.class public final Lae1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/SharedPreferences;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lae1;->α:Landroid/content/SharedPreferences;

    .line 5
    .line 6
    return-void
.end method

.method public static α(Lae1;Ljava/lang/Long;)V
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object p0, p0, Lae1;->α:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    new-instance v2, Lnc1;

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    invoke-direct {v2, p1, v3}, Lnc1;-><init>(Ljava/lang/Long;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0, v1, v2}, Lxn0;->θ(Landroid/content/SharedPreferences;JLa80;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static β(Lae1;Ljava/lang/Long;)V
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object p0, p0, Lae1;->α:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    new-instance v2, Lnc1;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    invoke-direct {v2, p1, v3}, Lnc1;-><init>(Ljava/lang/Long;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0, v1, v2}, Lxn0;->θ(Landroid/content/SharedPreferences;JLa80;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static γ(Lae1;)V
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object p0, p0, Lae1;->α:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    new-instance v2, Lf71;

    .line 8
    .line 9
    const/16 v3, 0x15

    .line 10
    .line 11
    invoke-direct {v2, v3}, Lf71;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0, v1, v2}, Lxn0;->θ(Landroid/content/SharedPreferences;JLa80;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method
