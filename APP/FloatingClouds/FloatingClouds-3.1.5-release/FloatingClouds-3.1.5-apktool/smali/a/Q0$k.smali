.class public final La/Q0$k;
.super La/Q0$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/Q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "k"
.end annotation


# instance fields
.field public final c:La/Jf;

.field public final synthetic d:La/Q0;


# direct methods
.method public constructor <init>(La/Q0;La/Jf;)V
    .locals 0

    iput-object p1, p0, La/Q0$k;->d:La/Q0;

    invoke-direct {p0, p1}, La/Q0$j;-><init>(La/Q0;)V

    iput-object p2, p0, La/Q0$k;->c:La/Jf;

    return-void
.end method


# virtual methods
.method public final b()Landroid/content/IntentFilter;
    .locals 2

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.TIME_SET"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIMEZONE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIME_TICK"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-object v0
.end method

.method public final c()I
    .locals 22

    move-object/from16 v1, p0

    iget-object v0, v1, La/Q0$k;->c:La/Jf;

    iget-object v2, v0, La/Jf;->c:La/Jf$a;

    iget-wide v3, v2, La/Jf$a;->b:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    cmp-long v3, v3, v5

    const/4 v4, 0x1

    if-lez v3, :cond_0

    iget-boolean v0, v2, La/Jf$a;->a:Z

    goto/16 :goto_8

    :cond_0
    iget-object v3, v0, La/Jf;->a:Landroid/content/Context;

    const-string v5, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v3, v5}, La/n9;->i(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    const-string v6, "Failed to get last known location"

    const-string v7, "TwilightManager"

    const/4 v8, 0x0

    iget-object v9, v0, La/Jf;->b:Landroid/location/LocationManager;

    if-nez v5, :cond_2

    const-string v0, "network"

    :try_start_0
    invoke-virtual {v9, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v9, v0}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v7, v6, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    move-object v0, v8

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_2
    move-object v5, v8

    :goto_1
    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v3, v0}, La/n9;->i(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "gps"

    :try_start_1
    invoke-virtual {v9, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v9, v0}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v8
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    invoke-static {v7, v6, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_3
    :goto_2
    if-eqz v8, :cond_4

    if-eqz v5, :cond_4

    invoke-virtual {v8}, Landroid/location/Location;->getTime()J

    move-result-wide v9

    invoke-virtual {v5}, Landroid/location/Location;->getTime()J

    move-result-wide v11

    cmp-long v0, v9, v11

    if-lez v0, :cond_5

    :goto_3
    move-object v5, v8

    goto :goto_4

    :cond_4
    if-eqz v8, :cond_5

    goto :goto_3

    :cond_5
    :goto_4
    const/4 v0, 0x0

    if-eqz v5, :cond_c

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    sget-object v3, La/If;->d:La/If;

    if-nez v3, :cond_6

    new-instance v3, La/If;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    sput-object v3, La/If;->d:La/If;

    :cond_6
    sget-object v11, La/If;->d:La/If;

    const-wide/32 v6, 0x5265c00

    sub-long v12, v9, v6

    invoke-virtual {v5}, Landroid/location/Location;->getLatitude()D

    move-result-wide v14

    invoke-virtual {v5}, Landroid/location/Location;->getLongitude()D

    move-result-wide v16

    invoke-virtual/range {v11 .. v17}, La/If;->a(JDD)V

    invoke-virtual {v5}, Landroid/location/Location;->getLatitude()D

    move-result-wide v12

    move-object v8, v11

    move-wide v11, v12

    invoke-virtual {v5}, Landroid/location/Location;->getLongitude()D

    move-result-wide v13

    invoke-virtual/range {v8 .. v14}, La/If;->a(JDD)V

    move-object v11, v8

    iget v3, v11, La/If;->c:I

    if-ne v3, v4, :cond_7

    move v0, v4

    :cond_7
    iget-wide v12, v11, La/If;->b:J

    iget-wide v14, v11, La/If;->a:J

    add-long/2addr v6, v9

    move-wide/from16 v16, v14

    invoke-virtual {v5}, Landroid/location/Location;->getLatitude()D

    move-result-wide v14

    invoke-virtual {v5}, Landroid/location/Location;->getLongitude()D

    move-result-wide v18

    move-wide/from16 v20, v12

    move-wide v12, v6

    move-wide/from16 v5, v20

    move-wide/from16 v7, v16

    move-wide/from16 v16, v18

    invoke-virtual/range {v11 .. v17}, La/If;->a(JDD)V

    iget-wide v12, v11, La/If;->b:J

    const-wide/16 v14, -0x1

    cmp-long v3, v5, v14

    if-eqz v3, :cond_b

    cmp-long v3, v7, v14

    if-nez v3, :cond_8

    goto :goto_6

    :cond_8
    cmp-long v3, v9, v7

    if-lez v3, :cond_9

    goto :goto_5

    :cond_9
    cmp-long v3, v9, v5

    if-lez v3, :cond_a

    move-wide v12, v7

    goto :goto_5

    :cond_a
    move-wide v12, v5

    :goto_5
    const-wide/32 v5, 0xea60

    add-long/2addr v12, v5

    goto :goto_7

    :cond_b
    :goto_6
    const-wide/32 v5, 0x2932e00

    add-long v12, v9, v5

    :goto_7
    iput-boolean v0, v2, La/Jf$a;->a:Z

    iput-wide v12, v2, La/Jf$a;->b:J

    goto :goto_8

    :cond_c
    const-string v2, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."

    invoke-static {v7, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    const/16 v3, 0xb

    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/4 v3, 0x6

    if-lt v2, v3, :cond_d

    const/16 v3, 0x16

    if-lt v2, v3, :cond_e

    :cond_d
    move v0, v4

    :cond_e
    :goto_8
    if-eqz v0, :cond_f

    const/4 v0, 0x2

    return v0

    :cond_f
    return v4
.end method

.method public final d()V
    .locals 2

    const/4 v0, 0x1

    iget-object v1, p0, La/Q0$k;->d:La/Q0;

    invoke-virtual {v1, v0, v0}, La/Q0;->D(ZZ)Z

    return-void
.end method
