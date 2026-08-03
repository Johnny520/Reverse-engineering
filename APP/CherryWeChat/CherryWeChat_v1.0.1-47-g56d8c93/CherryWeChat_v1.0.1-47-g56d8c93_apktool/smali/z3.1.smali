.class public final Lz3;
.super LB3;
.source ""


# instance fields
.field public final synthetic c:I

.field public final synthetic d:LE3;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LE3;Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lz3;->c:I

    .line 3
    iput-object p1, p0, Lz3;->d:LE3;

    invoke-direct {p0, p1}, LB3;-><init>(LE3;)V

    .line 4
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "power"

    .line 5
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/PowerManager;

    iput-object p1, p0, Lz3;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LE3;Lw4;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lz3;->c:I

    .line 1
    iput-object p1, p0, Lz3;->d:LE3;

    invoke-direct {p0, p1}, LB3;-><init>(LE3;)V

    .line 2
    iput-object p2, p0, Lz3;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e()Landroid/content/IntentFilter;
    .locals 2

    iget v0, p0, Lz3;->c:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.TIME_SET"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIMEZONE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIME_TICK"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-object v0

    :pswitch_0
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.os.action.POWER_SAVE_MODE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h()I
    .locals 22

    move-object/from16 v0, p0

    iget v1, v0, Lz3;->c:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lz3;->e:Ljava/lang/Object;

    check-cast v1, Lw4;

    iget-object v2, v1, Lw4;->c:Ljava/lang/Object;

    check-cast v2, LSB;

    iget-object v3, v1, Lw4;->b:Ljava/lang/Object;

    check-cast v3, Landroid/location/LocationManager;

    iget-wide v4, v2, LSB;->b:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    cmp-long v4, v4, v6

    const/4 v5, 0x1

    if-lez v4, :cond_0

    iget-boolean v1, v2, LSB;->a:Z

    goto/16 :goto_6

    :cond_0
    iget-object v1, v1, Lw4;->d:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    const-string v4, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v1, v4}, LDc;->d(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    const/4 v6, 0x0

    if-nez v4, :cond_1

    const-string v4, "network"

    :try_start_0
    invoke-virtual {v3, v4}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v3, v4}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    move-object v4, v6

    :goto_0
    const-string v7, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v1, v7}, LDc;->d(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "gps"

    :try_start_1
    invoke-virtual {v3, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v3, v1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_2
    if-eqz v6, :cond_3

    if-eqz v4, :cond_3

    invoke-virtual {v6}, Landroid/location/Location;->getTime()J

    move-result-wide v7

    invoke-virtual {v4}, Landroid/location/Location;->getTime()J

    move-result-wide v9

    cmp-long v1, v7, v9

    if-lez v1, :cond_4

    :goto_1
    move-object v4, v6

    goto :goto_2

    :cond_3
    if-eqz v6, :cond_4

    goto :goto_1

    :cond_4
    :goto_2
    const/4 v1, 0x0

    if-eqz v4, :cond_b

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    sget-object v3, LRB;->d:LRB;

    if-nez v3, :cond_5

    new-instance v3, LRB;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    sput-object v3, LRB;->d:LRB;

    :cond_5
    sget-object v13, LRB;->d:LRB;

    const-wide/32 v20, 0x5265c00

    sub-long v18, v11, v20

    invoke-virtual {v4}, Landroid/location/Location;->getLatitude()D

    move-result-wide v14

    invoke-virtual {v4}, Landroid/location/Location;->getLongitude()D

    move-result-wide v16

    invoke-virtual/range {v13 .. v19}, LRB;->a(DDJ)V

    invoke-virtual {v4}, Landroid/location/Location;->getLatitude()D

    move-result-wide v7

    invoke-virtual {v4}, Landroid/location/Location;->getLongitude()D

    move-result-wide v9

    move-object v6, v13

    invoke-virtual/range {v6 .. v12}, LRB;->a(DDJ)V

    iget v3, v13, LRB;->c:I

    if-ne v3, v5, :cond_6

    move v1, v5

    :cond_6
    iget-wide v6, v13, LRB;->b:J

    iget-wide v8, v13, LRB;->a:J

    add-long v18, v11, v20

    invoke-virtual {v4}, Landroid/location/Location;->getLatitude()D

    move-result-wide v14

    invoke-virtual {v4}, Landroid/location/Location;->getLongitude()D

    move-result-wide v16

    invoke-virtual/range {v13 .. v19}, LRB;->a(DDJ)V

    iget-wide v3, v13, LRB;->b:J

    const-wide/16 v13, -0x1

    cmp-long v10, v6, v13

    if-eqz v10, :cond_a

    cmp-long v10, v8, v13

    if-nez v10, :cond_7

    goto :goto_4

    :cond_7
    cmp-long v10, v11, v8

    if-lez v10, :cond_8

    move-wide v6, v3

    goto :goto_3

    :cond_8
    cmp-long v3, v11, v6

    if-lez v3, :cond_9

    move-wide v6, v8

    :cond_9
    :goto_3
    const-wide/32 v3, 0xea60

    add-long/2addr v6, v3

    goto :goto_5

    :cond_a
    :goto_4
    const-wide/32 v3, 0x2932e00

    add-long v6, v11, v3

    :goto_5
    iput-boolean v1, v2, LSB;->a:Z

    iput-wide v6, v2, LSB;->b:J

    goto :goto_6

    :cond_b
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    const/16 v3, 0xb

    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/4 v3, 0x6

    if-lt v2, v3, :cond_c

    const/16 v3, 0x16

    if-lt v2, v3, :cond_d

    :cond_c
    move v1, v5

    :cond_d
    :goto_6
    if-eqz v1, :cond_e

    const/4 v5, 0x2

    :cond_e
    return v5

    :pswitch_0
    iget-object v1, v0, Lz3;->e:Ljava/lang/Object;

    check-cast v1, Landroid/os/PowerManager;

    invoke-static {v1}, Lu3;->a(Landroid/os/PowerManager;)Z

    move-result v1

    if-eqz v1, :cond_f

    const/4 v1, 0x2

    goto :goto_7

    :cond_f
    const/4 v1, 0x1

    :goto_7
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m()V
    .locals 2

    iget v0, p0, Lz3;->c:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lz3;->d:LE3;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v1}, LE3;->m(ZZ)Z

    return-void

    :pswitch_0
    iget-object v0, p0, Lz3;->d:LE3;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v1}, LE3;->m(ZZ)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
