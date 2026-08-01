.class public abstract Lui1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/lang/Object;

.field public static volatile β:Landroid/content/Context; = null

.field public static volatile γ:Landroid/content/SharedPreferences; = null

.field public static volatile δ:Landroid/content/SharedPreferences; = null

.field public static volatile ε:Landroid/content/SharedPreferences; = null

.field public static volatile ζ:Ljava/lang/String; = ""

.field public static volatile η:Ljava/lang/String; = ""

.field public static volatile θ:J

.field public static final ι:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static final κ:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lui1;->α:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lui1;->ι:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 14
    .line 15
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lui1;->κ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    return-void
.end method

.method public static Α()Z
    .locals 1

    .line 1
    sget-object v0, Lui1;->γ:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public static Β(Ljava/lang/String;)V
    .locals 5

    .line 1
    sget-object v0, Lui1;->κ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, La80;

    .line 18
    .line 19
    :try_start_0
    invoke-interface {v1, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "config changed listener error: "

    .line 29
    .line 30
    invoke-static {v2, v1}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v2, 0x4

    .line 35
    const-string v3, "r24d5e64064e1c279"

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-static {v3, v1, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return-void
.end method

.method public static Γ(Ljava/lang/String;)V
    .locals 5

    .line 1
    sget-object v0, Lui1;->ι:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, La80;

    .line 18
    .line 19
    :try_start_0
    invoke-interface {v1, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "profile listener error: "

    .line 29
    .line 30
    invoke-static {v2, v1}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v2, 0x4

    .line 35
    const-string v3, "r24d5e64064e1c279"

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-static {v3, v1, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return-void
.end method

.method public static Δ(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x4

    .line 8
    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public static Ε(Ljava/lang/String;Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 17
    .line 18
    .line 19
    const-string v0, "info_bar_enabled"

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    sget-object v0, Lui1;->γ:Landroid/content/SharedPreferences;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    invoke-static {p0}, Lui1;->Β(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const-string v0, "putBool \u5931\u8d25 ["

    .line 58
    .line 59
    const-string v1, "]: "

    .line 60
    .line 61
    invoke-static {v0, p0, v1, p1}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const/4 p1, 0x4

    .line 66
    const-string v0, "r24d5e64064e1c279"

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    invoke-static {v0, p0, v1, p1, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public static Ζ(Ljava/lang/String;F)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Lui1;->Β(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "putFloat \u5931\u8d25 ["

    .line 26
    .line 27
    const-string v1, "]: "

    .line 28
    .line 29
    invoke-static {v0, p0, v1, p1}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const/4 p1, 0x4

    .line 34
    const-string v0, "r24d5e64064e1c279"

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-static {v0, p0, v1, p1, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public static Η(Ljava/lang/String;I)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Lui1;->Β(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "putInt \u5931\u8d25 ["

    .line 26
    .line 27
    const-string v1, "]: "

    .line 28
    .line 29
    invoke-static {v0, p0, v1, p1}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const/4 p1, 0x4

    .line 34
    const-string v0, "r24d5e64064e1c279"

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-static {v0, p0, v1, p1, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public static Θ(JLjava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p2, p0, p1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string p1, "putLong \u5931\u8d25 ["

    .line 23
    .line 24
    const-string v0, "]: "

    .line 25
    .line 26
    invoke-static {p1, p2, v0, p0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const/4 p1, 0x4

    .line 31
    const-string p2, "r24d5e64064e1c279"

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-static {p2, p0, v0, p1, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static Ι(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Lui1;->Β(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v0, "putString \u5931\u8d25 ["

    .line 32
    .line 33
    const-string v1, "]: "

    .line 34
    .line 35
    invoke-static {v0, p0, v1, p1}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const/4 p1, 0x4

    .line 40
    const-string v0, "r24d5e64064e1c279"

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-static {v0, p0, v1, p1, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static Κ(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Lui1;->Β(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "remove \u5931\u8d25 ["

    .line 29
    .line 30
    const-string v2, "]: "

    .line 31
    .line 32
    invoke-static {v1, p0, v2, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const/4 v0, 0x4

    .line 37
    const-string v1, "r24d5e64064e1c279"

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-static {v1, p0, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static Λ(Landroid/content/SharedPreferences;)V
    .locals 15

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto/16 :goto_a

    .line 4
    .line 5
    :cond_0
    const-string v1, "double_tap_menu_enabled"

    .line 6
    .line 7
    invoke-interface {p0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x4

    .line 12
    const-string v3, "r24d5e64064e1c279"

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    :try_start_0
    invoke-interface {p0, v1, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    new-instance v6, Leo1;

    .line 29
    .line 30
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    move-object v0, v6

    .line 34
    :goto_0
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 35
    .line 36
    instance-of v7, v0, Leo1;

    .line 37
    .line 38
    if-eqz v7, :cond_1

    .line 39
    .line 40
    move-object v0, v6

    .line 41
    :cond_1
    check-cast v0, Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    const-string v0, "\u68c0\u6d4b\u5230\u65e7\u7248\u53cc\u51fb\u5524\u51fa\u83dc\u5355\u5f00\u5173=true\uff0c\u5df2\u5f3a\u5236\u5173\u95ed"

    .line 50
    .line 51
    invoke-static {v3, v0, v5, v2, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    move-object v0, v5

    .line 66
    :goto_1
    const-string v13, "\u5e95\u90e8\u533a\u57df"

    .line 67
    .line 68
    const-string v14, "\u53f3\u4e0b\u533a\u57df"

    .line 69
    .line 70
    const-string v6, "\u5de6\u4e0a\u533a\u57df"

    .line 71
    .line 72
    const-string v7, "\u9876\u90e8\u533a\u57df"

    .line 73
    .line 74
    const-string v8, "\u53f3\u4e0a\u533a\u57df"

    .line 75
    .line 76
    const-string v9, "\u5de6\u4fa7\u4e92\u52a8\u533a"

    .line 77
    .line 78
    const-string v10, "\u4e2d\u95f4\u533a\u57df"

    .line 79
    .line 80
    const-string v11, "\u53f3\u4fa7\u4e92\u52a8\u533a"

    .line 81
    .line 82
    const-string v12, "\u5de6\u4e0b\u533a\u57df"

    .line 83
    .line 84
    filled-new-array/range {v6 .. v14}, [Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    const-string v6, "double_tap"

    .line 89
    .line 90
    const-string v7, "long_press"

    .line 91
    .line 92
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    move v7, v4

    .line 97
    :goto_2
    const/16 v8, 0x9

    .line 98
    .line 99
    if-ge v7, v8, :cond_d

    .line 100
    .line 101
    aget-object v8, v1, v7

    .line 102
    .line 103
    move-object v9, v0

    .line 104
    move v10, v4

    .line 105
    :goto_3
    const/4 v0, 0x2

    .line 106
    if-ge v10, v0, :cond_c

    .line 107
    .line 108
    aget-object v0, v6, v10

    .line 109
    .line 110
    const-string v11, "gesture_"

    .line 111
    .line 112
    const-string v12, "_"

    .line 113
    .line 114
    invoke-static {v11, v8, v12, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    :try_start_1
    invoke-interface {p0, v11, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 122
    goto :goto_4

    .line 123
    :catchall_1
    move-exception v0

    .line 124
    new-instance v12, Leo1;

    .line 125
    .line 126
    invoke-direct {v12, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    move-object v0, v12

    .line 130
    :goto_4
    instance-of v12, v0, Leo1;

    .line 131
    .line 132
    if-eqz v12, :cond_4

    .line 133
    .line 134
    move-object v0, v5

    .line 135
    :cond_4
    check-cast v0, Ljava/lang/String;

    .line 136
    .line 137
    if-eqz v0, :cond_5

    .line 138
    .line 139
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    goto :goto_5

    .line 148
    :cond_5
    move-object v0, v5

    .line 149
    :goto_5
    if-eqz v0, :cond_b

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 152
    .line 153
    .line 154
    move-result v12

    .line 155
    const v13, -0x556cbec9

    .line 156
    .line 157
    .line 158
    if-eq v12, v13, :cond_8

    .line 159
    .line 160
    const v13, -0x473ab4ae

    .line 161
    .line 162
    .line 163
    if-eq v12, v13, :cond_7

    .line 164
    .line 165
    const v13, 0x2f0c7f68

    .line 166
    .line 167
    .line 168
    if-eq v12, v13, :cond_6

    .line 169
    .line 170
    goto :goto_9

    .line 171
    :cond_6
    const-string v12, "\u64cd\u4f5c\u83dc\u5355"

    .line 172
    .line 173
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v12

    .line 177
    if-nez v12, :cond_9

    .line 178
    .line 179
    goto :goto_9

    .line 180
    :cond_7
    const-string v12, "module_menu"

    .line 181
    .line 182
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v12

    .line 186
    if-eqz v12, :cond_b

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_8
    const-string v12, "operation_menu"

    .line 190
    .line 191
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v12

    .line 195
    if-nez v12, :cond_9

    .line 196
    .line 197
    goto :goto_9

    .line 198
    :cond_9
    :goto_6
    if-eqz v9, :cond_a

    .line 199
    .line 200
    :goto_7
    move-object v12, v9

    .line 201
    goto :goto_8

    .line 202
    :cond_a
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 203
    .line 204
    .line 205
    move-result-object v9

    .line 206
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    goto :goto_7

    .line 210
    :goto_8
    const-string v13, "\u65e0"

    .line 211
    .line 212
    invoke-interface {v9, v11, v13}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 213
    .line 214
    .line 215
    new-instance v9, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    const-string v13, "\u5df2\u6e05\u7406\u65e7\u7248\u624b\u52bf\u52a8\u4f5c "

    .line 218
    .line 219
    invoke-direct {v9, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    const-string v11, "="

    .line 226
    .line 227
    const-string v13, " -> \u65e0"

    .line 228
    .line 229
    invoke-static {v9, v11, v0, v13}, Lnx;->μ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-static {v3, v0, v5, v2, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    move-object v9, v12

    .line 237
    :cond_b
    :goto_9
    add-int/lit8 v10, v10, 0x1

    .line 238
    .line 239
    goto/16 :goto_3

    .line 240
    .line 241
    :cond_c
    add-int/lit8 v7, v7, 0x1

    .line 242
    .line 243
    move-object v0, v9

    .line 244
    goto/16 :goto_2

    .line 245
    .line 246
    :cond_d
    if-eqz v0, :cond_e

    .line 247
    .line 248
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 249
    .line 250
    .line 251
    :cond_e
    :goto_a
    return-void
.end method

.method public static Μ(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    .line 1
    const-string v0, "blacklist_blocked"

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "blacklist_uid"

    .line 34
    .line 35
    invoke-interface {v1, v2, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    const-string v1, "blacklist_reason"

    .line 44
    .line 45
    invoke-interface {p2, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string p2, "blacklist_checked_at"

    .line 50
    .line 51
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    invoke-interface {p1, p2, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, Lui1;->Β(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-string p2, "saveBlacklistResult failed uid="

    .line 72
    .line 73
    const-string v0, ": "

    .line 74
    .line 75
    invoke-static {p2, p0, v0, p1}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    const/4 p1, 0x4

    .line 80
    const-string p2, "r24d5e64064e1c279"

    .line 81
    .line 82
    const/4 v0, 0x0

    .line 83
    invoke-static {p2, p0, v0, p1, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public static Ν(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "setCurrentUid pending uid="

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    const-string v1, "0"

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    sget-object v1, Lui1;->α:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v1

    .line 32
    :try_start_0
    sput-object p0, Lui1;->η:Ljava/lang/String;

    .line 33
    .line 34
    sget-object v2, Lui1;->β:Landroid/content/Context;

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    const-string v2, "r24d5e64064e1c279"

    .line 39
    .line 40
    new-instance v3, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v0, " source="

    .line 49
    .line 50
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const/4 v0, 0x4

    .line 61
    const/4 v3, 0x0

    .line 62
    invoke-static {v2, p1, v3, v0, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception p0

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-static {p0, p1}, Lui1;->Ξ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    :goto_0
    monitor-exit v1

    .line 74
    if-eqz p1, :cond_2

    .line 75
    .line 76
    invoke-static {p0}, Lui1;->Γ(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :goto_1
    monitor-exit v1

    .line 81
    throw p0

    .line 82
    :cond_2
    :goto_2
    return-void
.end method

.method public static Ξ(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 19

    .line 1
    invoke-static/range {p0 .. p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    const-string v1, "0"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    :cond_0
    :goto_0
    move/from16 v18, v2

    .line 25
    .line 26
    goto/16 :goto_c

    .line 27
    .line 28
    :cond_1
    sget-object v1, Lui1;->β:Landroid/content/Context;

    .line 29
    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    sget-object v3, Lui1;->ζ:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_3

    .line 40
    .line 41
    sget-object v3, Lui1;->δ:Landroid/content/SharedPreferences;

    .line 42
    .line 43
    if-eqz v3, :cond_3

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    invoke-static {v0}, Lui1;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v1, v3}, Lui1;->Δ(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    const/4 v7, 0x4

    .line 67
    const-string v8, "r24d5e64064e1c279"

    .line 68
    .line 69
    const/4 v9, 0x0

    .line 70
    if-eqz v5, :cond_4

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    const-string v5, "__dyhelper_schema_version"

    .line 74
    .line 75
    invoke-interface {v1, v5, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    const-string v11, "__dyhelper_account_uid"

    .line 80
    .line 81
    const-string v12, ""

    .line 82
    .line 83
    invoke-interface {v1, v11, v12}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    if-eqz v13, :cond_5

    .line 88
    .line 89
    invoke-static {v13}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 90
    .line 91
    .line 92
    move-result-object v13

    .line 93
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v13

    .line 97
    goto :goto_1

    .line 98
    :cond_5
    move-object v13, v9

    .line 99
    :goto_1
    if-nez v13, :cond_6

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_6
    move-object v12, v13

    .line 103
    :goto_2
    const/4 v13, 0x2

    .line 104
    if-lt v10, v13, :cond_a

    .line 105
    .line 106
    invoke-static {v12}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    if-eqz v10, :cond_7

    .line 111
    .line 112
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    invoke-interface {v10, v11, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    invoke-interface {v10}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 121
    .line 122
    .line 123
    :cond_7
    invoke-static {v12}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 124
    .line 125
    .line 126
    move-result v10

    .line 127
    if-nez v10, :cond_9

    .line 128
    .line 129
    invoke-virtual {v12, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    if-eqz v10, :cond_8

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_8
    const-string v10, "\u8d26\u53f7\u914d\u7f6e\u6587\u4ef6 UID \u4e0d\u4e00\u81f4\uff0c\u91cd\u5efa\u3002fileUid="

    .line 137
    .line 138
    const-string v14, " currentUid="

    .line 139
    .line 140
    invoke-static {v10, v12, v14, v4}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    invoke-static {v8, v10, v9, v7, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    invoke-interface {v10}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    invoke-interface {v10}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_9
    :goto_3
    const/16 p0, 0x1

    .line 160
    .line 161
    goto/16 :goto_b

    .line 162
    .line 163
    :cond_a
    :goto_4
    sget-object v10, Lui1;->γ:Landroid/content/SharedPreferences;

    .line 164
    .line 165
    if-eqz v10, :cond_b

    .line 166
    .line 167
    invoke-interface {v10}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    goto :goto_5

    .line 172
    :cond_b
    move-object v10, v9

    .line 173
    :goto_5
    if-nez v10, :cond_c

    .line 174
    .line 175
    sget-object v10, Lkz;->ε:Lkz;

    .line 176
    .line 177
    :cond_c
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 178
    .line 179
    .line 180
    move-result-object v12

    .line 181
    invoke-interface {v10}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 182
    .line 183
    .line 184
    move-result-object v14

    .line 185
    invoke-interface {v14}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 186
    .line 187
    .line 188
    move-result-object v14

    .line 189
    :goto_6
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 190
    .line 191
    .line 192
    move-result v15

    .line 193
    if-eqz v15, :cond_16

    .line 194
    .line 195
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v15

    .line 199
    check-cast v15, Ljava/util/Map$Entry;

    .line 200
    .line 201
    invoke-interface {v15}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v16

    .line 205
    const/16 p0, 0x1

    .line 206
    .line 207
    move-object/from16 v6, v16

    .line 208
    .line 209
    check-cast v6, Ljava/lang/String;

    .line 210
    .line 211
    invoke-interface {v15}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v15

    .line 215
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    const-string v7, "__dyhelper_"

    .line 219
    .line 220
    invoke-static {v6, v7, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 221
    .line 222
    .line 223
    move-result v7

    .line 224
    if-nez v7, :cond_15

    .line 225
    .line 226
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    instance-of v7, v15, Ljava/lang/Boolean;

    .line 230
    .line 231
    if-eqz v7, :cond_d

    .line 232
    .line 233
    check-cast v15, Ljava/lang/Boolean;

    .line 234
    .line 235
    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    .line 236
    .line 237
    .line 238
    move-result v7

    .line 239
    invoke-interface {v12, v6, v7}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 240
    .line 241
    .line 242
    goto/16 :goto_9

    .line 243
    .line 244
    :cond_d
    instance-of v7, v15, Ljava/lang/Integer;

    .line 245
    .line 246
    if-eqz v7, :cond_e

    .line 247
    .line 248
    check-cast v15, Ljava/lang/Number;

    .line 249
    .line 250
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    invoke-interface {v12, v6, v7}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 255
    .line 256
    .line 257
    goto :goto_9

    .line 258
    :cond_e
    instance-of v7, v15, Ljava/lang/Long;

    .line 259
    .line 260
    if-eqz v7, :cond_10

    .line 261
    .line 262
    check-cast v15, Ljava/lang/Number;

    .line 263
    .line 264
    move-object/from16 v17, v10

    .line 265
    .line 266
    invoke-virtual {v15}, Ljava/lang/Number;->longValue()J

    .line 267
    .line 268
    .line 269
    move-result-wide v9

    .line 270
    invoke-interface {v12, v6, v9, v10}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 271
    .line 272
    .line 273
    :cond_f
    :goto_7
    move/from16 v18, v2

    .line 274
    .line 275
    goto :goto_a

    .line 276
    :cond_10
    move-object/from16 v17, v10

    .line 277
    .line 278
    instance-of v9, v15, Ljava/lang/Float;

    .line 279
    .line 280
    if-eqz v9, :cond_11

    .line 281
    .line 282
    check-cast v15, Ljava/lang/Number;

    .line 283
    .line 284
    invoke-virtual {v15}, Ljava/lang/Number;->floatValue()F

    .line 285
    .line 286
    .line 287
    move-result v9

    .line 288
    invoke-interface {v12, v6, v9}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 289
    .line 290
    .line 291
    goto :goto_7

    .line 292
    :cond_11
    instance-of v9, v15, Ljava/lang/String;

    .line 293
    .line 294
    if-eqz v9, :cond_12

    .line 295
    .line 296
    check-cast v15, Ljava/lang/String;

    .line 297
    .line 298
    invoke-interface {v12, v6, v15}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 299
    .line 300
    .line 301
    goto :goto_7

    .line 302
    :cond_12
    instance-of v9, v15, Ljava/util/Set;

    .line 303
    .line 304
    if-eqz v9, :cond_f

    .line 305
    .line 306
    check-cast v15, Ljava/lang/Iterable;

    .line 307
    .line 308
    new-instance v9, Ljava/util/ArrayList;

    .line 309
    .line 310
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 311
    .line 312
    .line 313
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 314
    .line 315
    .line 316
    move-result-object v10

    .line 317
    :goto_8
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 318
    .line 319
    .line 320
    move-result v15

    .line 321
    if-eqz v15, :cond_14

    .line 322
    .line 323
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v15

    .line 327
    move/from16 v18, v2

    .line 328
    .line 329
    instance-of v2, v15, Ljava/lang/String;

    .line 330
    .line 331
    if-eqz v2, :cond_13

    .line 332
    .line 333
    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    :cond_13
    move/from16 v2, v18

    .line 337
    .line 338
    goto :goto_8

    .line 339
    :cond_14
    move/from16 v18, v2

    .line 340
    .line 341
    invoke-static {v9}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    invoke-interface {v12, v6, v2}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 346
    .line 347
    .line 348
    goto :goto_a

    .line 349
    :cond_15
    :goto_9
    move/from16 v18, v2

    .line 350
    .line 351
    move-object/from16 v17, v10

    .line 352
    .line 353
    :goto_a
    move-object/from16 v10, v17

    .line 354
    .line 355
    move/from16 v2, v18

    .line 356
    .line 357
    const/4 v7, 0x4

    .line 358
    const/4 v9, 0x0

    .line 359
    goto/16 :goto_6

    .line 360
    .line 361
    :cond_16
    move-object/from16 v17, v10

    .line 362
    .line 363
    const/16 p0, 0x1

    .line 364
    .line 365
    invoke-interface {v12, v5, v13}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    invoke-interface {v2, v11, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    invoke-interface/range {v17 .. v17}, Ljava/util/Map;->isEmpty()Z

    .line 374
    .line 375
    .line 376
    move-result v4

    .line 377
    xor-int/lit8 v4, v4, 0x1

    .line 378
    .line 379
    const-string v5, "__dyhelper_migrated_from_legacy"

    .line 380
    .line 381
    invoke-interface {v2, v5, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    const-string v4, "__dyhelper_migrated_at"

    .line 386
    .line 387
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 388
    .line 389
    .line 390
    move-result-wide v5

    .line 391
    invoke-interface {v2, v4, v5, v6}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 396
    .line 397
    .line 398
    :goto_b
    invoke-static {v1}, Lui1;->Λ(Landroid/content/SharedPreferences;)V

    .line 399
    .line 400
    .line 401
    sput-object v0, Lui1;->ζ:Ljava/lang/String;

    .line 402
    .line 403
    sput-object v1, Lui1;->δ:Landroid/content/SharedPreferences;

    .line 404
    .line 405
    sget-wide v1, Lui1;->θ:J

    .line 406
    .line 407
    const-wide/16 v4, 0x1

    .line 408
    .line 409
    add-long/2addr v1, v4

    .line 410
    sput-wide v1, Lui1;->θ:J

    .line 411
    .line 412
    sget-object v1, Lui1;->ε:Landroid/content/SharedPreferences;

    .line 413
    .line 414
    if-eqz v1, :cond_17

    .line 415
    .line 416
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    if-eqz v1, :cond_17

    .line 421
    .line 422
    const-string v2, "last_uid"

    .line 423
    .line 424
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    if-eqz v1, :cond_17

    .line 429
    .line 430
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 431
    .line 432
    .line 433
    :cond_17
    sget-wide v1, Lui1;->θ:J

    .line 434
    .line 435
    const-string v4, " file="

    .line 436
    .line 437
    const-string v5, " source="

    .line 438
    .line 439
    const-string v6, "\u5f53\u524d\u8d26\u53f7\u914d\u7f6e\u5df2\u5207\u6362 uid="

    .line 440
    .line 441
    invoke-static {v6, v0, v4, v3, v5}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    move-object/from16 v3, p1

    .line 446
    .line 447
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    const-string v3, " generation="

    .line 451
    .line 452
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    const/4 v1, 0x4

    .line 463
    const/4 v7, 0x0

    .line 464
    invoke-static {v8, v0, v7, v1, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    return p0

    .line 468
    :goto_c
    return v18
.end method

.method public static α(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    if-ge v2, v1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-static {v3}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    const/16 v4, 0x5f

    .line 32
    .line 33
    if-eq v3, v4, :cond_0

    .line 34
    .line 35
    const/16 v4, 0x2d

    .line 36
    .line 37
    if-ne v3, v4, :cond_1

    .line 38
    .line 39
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 40
    .line 41
    .line 42
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    const-string p0, "unknown"

    .line 56
    .line 57
    :cond_3
    const-string v0, "dyhelper_prefs_uid_"

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public static β(La80;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lui1;->κ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static γ()Lsi1;
    .locals 12

    .line 1
    sget-object v1, Lui1;->α:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    sget-object v2, Lui1;->β:Landroid/content/Context;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    new-instance v3, Lsi1;

    .line 10
    .line 11
    sget-object v5, Ljz;->ε:Ljz;

    .line 12
    .line 13
    const-string v2, "PrefsManager \u672a\u521d\u59cb\u5316"

    .line 14
    .line 15
    invoke-static {v2}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v8

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    invoke-direct/range {v3 .. v8}, Lsi1;-><init>(ZLjava/util/List;IILjava/util/List;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :catchall_0
    move-exception v0

    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :cond_0
    invoke-static {v2}, Lui1;->ε(Landroid/content/Context;)Ljava/util/LinkedHashSet;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    new-instance v4, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    move v9, v0

    .line 44
    move v10, v9

    .line 45
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    move-object v6, v0

    .line 56
    check-cast v6, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    :try_start_1
    invoke-static {v2, v6}, Lui1;->Δ(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_1

    .line 75
    .line 76
    add-int/lit8 v9, v9, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v7, ": clear commit=false"

    .line 88
    .line 89
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    :goto_1
    invoke-static {v2, v6, v4}, Lui1;->δ(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;)I

    .line 100
    .line 101
    .line 102
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 103
    add-int/2addr v10, v0

    .line 104
    goto :goto_0

    .line 105
    :catchall_1
    move-exception v0

    .line 106
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    if-nez v7, :cond_2

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string v6, ": "

    .line 129
    .line 130
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_3
    const-string v0, "dyhelper_prefs"

    .line 145
    .line 146
    invoke-static {v2, v0}, Lui1;->Δ(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    sput-object v0, Lui1;->γ:Landroid/content/SharedPreferences;

    .line 151
    .line 152
    const-string v0, "dyhelper_prefs_meta"

    .line 153
    .line 154
    invoke-static {v2, v0}, Lui1;->Δ(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    sput-object v0, Lui1;->ε:Landroid/content/SharedPreferences;

    .line 159
    .line 160
    sget-object v0, Lui1;->γ:Landroid/content/SharedPreferences;

    .line 161
    .line 162
    sput-object v0, Lui1;->δ:Landroid/content/SharedPreferences;

    .line 163
    .line 164
    const-string v0, ""

    .line 165
    .line 166
    sput-object v0, Lui1;->ζ:Ljava/lang/String;

    .line 167
    .line 168
    const-string v0, ""

    .line 169
    .line 170
    sput-object v0, Lui1;->η:Ljava/lang/String;

    .line 171
    .line 172
    sget-wide v5, Lui1;->θ:J

    .line 173
    .line 174
    const-wide/16 v7, 0x1

    .line 175
    .line 176
    add-long/2addr v5, v7

    .line 177
    sput-wide v5, Lui1;->θ:J

    .line 178
    .line 179
    new-instance v6, Lsi1;

    .line 180
    .line 181
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    invoke-static {v3}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    invoke-static {v4}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    invoke-direct/range {v6 .. v11}, Lsi1;-><init>(ZLjava/util/List;IILjava/util/List;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 194
    .line 195
    .line 196
    const/4 v0, 0x1

    .line 197
    move-object v3, v6

    .line 198
    :goto_2
    monitor-exit v1

    .line 199
    if-eqz v0, :cond_4

    .line 200
    .line 201
    const-string v0, ""

    .line 202
    .line 203
    invoke-static {v0}, Lui1;->Γ(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    const-string v0, "*"

    .line 207
    .line 208
    invoke-static {v0}, Lui1;->Β(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    :cond_4
    const-string v0, "r24d5e64064e1c279"

    .line 212
    .line 213
    iget-boolean v1, v3, Lsi1;->α:Z

    .line 214
    .line 215
    iget v2, v3, Lsi1;->γ:I

    .line 216
    .line 217
    iget v4, v3, Lsi1;->δ:I

    .line 218
    .line 219
    iget-object v5, v3, Lsi1;->ε:Ljava/util/List;

    .line 220
    .line 221
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    new-instance v6, Ljava/lang/StringBuilder;

    .line 226
    .line 227
    const-string v7, "\u5df2\u6267\u884c\u5168\u91cf\u7528\u6237\u914d\u7f6e\u6e05\u9664 success="

    .line 228
    .line 229
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    const-string v1, ", prefs="

    .line 236
    .line 237
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    const-string v1, ", deleted="

    .line 244
    .line 245
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    const-string v1, ", failures="

    .line 252
    .line 253
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    const/4 v2, 0x4

    .line 264
    const/4 v4, 0x0

    .line 265
    invoke-static {v0, v1, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    return-object v3

    .line 269
    :goto_3
    monitor-exit v1

    .line 270
    throw v0
.end method

.method public static δ(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/io/File;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 11
    .line 12
    const-string v1, "shared_prefs"

    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance p0, Ljava/io/File;

    .line 18
    .line 19
    const-string v1, ".xml"

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Ljava/io/File;

    .line 29
    .line 30
    const-string v2, ".xml.bak"

    .line 31
    .line 32
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    filled-new-array {p0, v1}, [Ljava/io/File;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const/4 p1, 0x0

    .line 52
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/io/File;

    .line 63
    .line 64
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_0

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_1

    .line 75
    .line 76
    add-int/lit8 p1, p1, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    new-instance v2, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v1, ": delete=false"

    .line 92
    .line 93
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :catchall_0
    move-exception v1

    .line 105
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    if-nez v2, :cond_2

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v0, ": "

    .line 132
    .line 133
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_3
    return p1
.end method

.method public static ε(Landroid/content/Context;)Ljava/util/LinkedHashSet;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "dyhelper_spark_records"

    .line 5
    .line 6
    const-string v1, "dy_titlebar_hidden_buttons"

    .line 7
    .line 8
    const-string v2, "dyhelper_prefs"

    .line 9
    .line 10
    const-string v3, "dyhelper_prefs_meta"

    .line 11
    .line 12
    const-string v4, "dyhelper_beta"

    .line 13
    .line 14
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Lg81;->ν([Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Ljava/io/File;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 29
    .line 30
    const-string v2, "shared_prefs"

    .line 31
    .line 32
    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 36
    .line 37
    .line 38
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    new-instance v1, Leo1;

    .line 42
    .line 43
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    move-object p0, v1

    .line 47
    :goto_0
    instance-of v1, p0, Leo1;

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    move-object p0, v2

    .line 53
    :cond_0
    check-cast p0, [Ljava/io/File;

    .line 54
    .line 55
    if-eqz p0, :cond_5

    .line 56
    .line 57
    array-length v1, p0

    .line 58
    const/4 v3, 0x0

    .line 59
    move v4, v3

    .line 60
    :goto_1
    if-ge v4, v1, :cond_5

    .line 61
    .line 62
    aget-object v5, p0, v4

    .line 63
    .line 64
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    const-string v6, ".xml"

    .line 72
    .line 73
    invoke-static {v5, v6, v3}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_1

    .line 78
    .line 79
    invoke-static {v5, v6}, Lq02;->о(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    goto :goto_2

    .line 84
    :cond_1
    const-string v6, ".xml.bak"

    .line 85
    .line 86
    invoke-static {v5, v6, v3}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eqz v7, :cond_2

    .line 91
    .line 92
    invoke-static {v5, v6}, Lq02;->о(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    goto :goto_2

    .line 97
    :cond_2
    move-object v5, v2

    .line 98
    :goto_2
    if-nez v5, :cond_3

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_3
    invoke-static {v5}, Lln0;->Ο(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-eqz v6, :cond_4

    .line 106
    .line 107
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    :cond_4
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_5
    return-object v0
.end method

.method public static ζ()Ljava/lang/String;
    .locals 9

    .line 1
    sget-object v0, Lui1;->α:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lui1;->β:Landroid/content/Context;

    .line 5
    .line 6
    if-eqz v1, :cond_3

    .line 7
    .line 8
    invoke-static {v1}, Lui1;->ε(Landroid/content/Context;)Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    new-instance v3, Lorg/json/JSONObject;

    .line 13
    .line 14
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v1, v4}, Lui1;->Δ(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    new-instance v6, Lorg/json/JSONObject;

    .line 38
    .line 39
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-interface {v5}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance v7, Ljava/util/TreeMap;

    .line 50
    .line 51
    invoke-direct {v7, v5}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v7}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eqz v7, :cond_0

    .line 67
    .line 68
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    check-cast v7, Ljava/util/Map$Entry;

    .line 73
    .line 74
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    check-cast v8, Ljava/lang/String;

    .line 79
    .line 80
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    invoke-static {v7}, Lv71;->ε(Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-virtual {v6, v8, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catchall_0
    move-exception v1

    .line 93
    goto :goto_3

    .line 94
    :cond_0
    invoke-virtual {v3, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_1
    new-instance v1, Lorg/json/JSONObject;

    .line 99
    .line 100
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v2, "format"

    .line 104
    .line 105
    const-string v4, "dyhelper_user_prefs"

    .line 106
    .line 107
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 108
    .line 109
    .line 110
    const-string v2, "format_version"

    .line 111
    .line 112
    const/4 v4, 0x1

    .line 113
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 114
    .line 115
    .line 116
    const-string v2, "exported_at"

    .line 117
    .line 118
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 119
    .line 120
    .line 121
    move-result-wide v4

    .line 122
    invoke-virtual {v1, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 123
    .line 124
    .line 125
    const-string v2, "current_uid"

    .line 126
    .line 127
    invoke-static {}, Lui1;->κ()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 132
    .line 133
    .line 134
    const-string v2, "current_profile"

    .line 135
    .line 136
    invoke-static {}, Lui1;->κ()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-eqz v4, :cond_2

    .line 145
    .line 146
    const-string v4, "dyhelper_prefs"

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_2
    invoke-static {}, Lui1;->κ()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-static {v4}, Lui1;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    :goto_2
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 158
    .line 159
    .line 160
    const-string v2, "prefs"

    .line 161
    .line 162
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 163
    .line 164
    .line 165
    const/4 v2, 0x2

    .line 166
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 170
    monitor-exit v0

    .line 171
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    return-object v1

    .line 175
    :cond_3
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 176
    .line 177
    const-string v2, "PrefsManager \u672a\u521d\u59cb\u5316"

    .line 178
    .line 179
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 183
    :goto_3
    monitor-exit v0

    .line 184
    throw v1
.end method

.method public static η(Ljava/lang/String;Z)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    const-string v0, "info_bar_enabled"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    sget-object v1, Lui1;->γ:Landroid/content/SharedPreferences;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {v1, p0, p1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    :cond_0
    if-nez v0, :cond_2

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return p0

    .line 35
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_3
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 42
    .line 43
    .line 44
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    return p0

    .line 46
    :catchall_0
    return p1
.end method

.method public static θ(Ljava/lang/String;)F
    .locals 2

    .line 1
    const-string v0, "comment_control_"

    .line 2
    .line 3
    const-string v1, "_alpha"

    .line 4
    .line 5
    invoke-static {v0, p0, v1}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0x64

    .line 10
    .line 11
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1, p0, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 16
    .line 17
    .line 18
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move p0, v0

    .line 21
    :goto_0
    const/4 v1, 0x0

    .line 22
    invoke-static {p0, v1, v0}, Lj81;->μ(III)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    int-to-float p0, p0

    .line 27
    const/high16 v0, 0x42c80000    # 100.0f

    .line 28
    .line 29
    div-float/2addr p0, v0

    .line 30
    return p0
.end method

.method public static ι(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "comment_control_"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, "_color"

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string v0, "#FFFFFFFF"

    .line 21
    .line 22
    invoke-static {p0, v0}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static κ()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lui1;->ζ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget-object v0, Lui1;->η:Ljava/lang/String;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public static λ(Ljava/lang/String;F)F
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 6
    .line 7
    .line 8
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    return p0

    .line 10
    :catchall_0
    return p1
.end method

.method public static μ()Landroid/content/SharedPreferences;
    .locals 2

    .line 1
    sget-object v0, Lui1;->δ:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    sget-object v0, Lui1;->η:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    sget-object v1, Lui1;->β:Landroid/content/Context;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    const-string v1, "lazy-prefs"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lui1;->Ν(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sget-object v0, Lui1;->δ:Landroid/content/SharedPreferences;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_1
    sget-object v0, Lui1;->γ:Landroid/content/SharedPreferences;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_2
    const-string v0, "r31210fee90a2f55c"

    .line 34
    .line 35
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    return-object v0
.end method

.method public static ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-object p0

    .line 16
    :catchall_0
    :goto_0
    return-object p1
.end method

.method public static ξ()Z
    .locals 7

    .line 1
    const-string v5, "collect"

    .line 2
    .line 3
    const-string v6, "share"

    .line 4
    .line 5
    const-string v0, "avatar"

    .line 6
    .line 7
    const-string v1, "follow"

    .line 8
    .line 9
    const-string v2, "color_ring"

    .line 10
    .line 11
    const-string v3, "digg"

    .line 12
    .line 13
    const-string v4, "comment"

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v1}, Lui1;->ω(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    return v0

    .line 54
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 55
    return v0
.end method

.method public static ο(Ljava/lang/String;)Lti1;
    .locals 14

    .line 1
    const-string v0, "\u914d\u7f6e\u6587\u4ef6\u4e0d\u662f\u6709\u6548 JSON: "

    .line 2
    .line 3
    sget-object v1, Lui1;->α:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    sget-object v2, Lui1;->β:Landroid/content/Context;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    new-instance p0, Lti1;

    .line 13
    .line 14
    const-string v0, "PrefsManager \u672a\u521d\u59cb\u5316"

    .line 15
    .line 16
    invoke-static {v0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {p0, v4, v4, v4, v0}, Lti1;-><init>(ZIILjava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    goto/16 :goto_6

    .line 24
    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto/16 :goto_7

    .line 27
    .line 28
    :cond_0
    :try_start_1
    new-instance v5, Lorg/json/JSONObject;

    .line 29
    .line 30
    invoke-direct {v5, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_1
    move-exception p0

    .line 35
    :try_start_2
    new-instance v5, Leo1;

    .line 36
    .line 37
    invoke-direct {v5, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-nez p0, :cond_f

    .line 45
    .line 46
    check-cast v5, Lorg/json/JSONObject;

    .line 47
    .line 48
    const-string p0, "format"

    .line 49
    .line 50
    invoke-virtual {v5, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    const-string v0, "dyhelper_user_prefs"

    .line 55
    .line 56
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-nez p0, :cond_1

    .line 61
    .line 62
    new-instance p0, Lti1;

    .line 63
    .line 64
    const-string v0, "\u914d\u7f6e\u6587\u4ef6\u683c\u5f0f\u4e0d\u5339\u914d"

    .line 65
    .line 66
    invoke-static {v0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-direct {p0, v4, v4, v4, v0}, Lti1;-><init>(ZIILjava/util/List;)V

    .line 71
    .line 72
    .line 73
    goto/16 :goto_6

    .line 74
    .line 75
    :cond_1
    const-string p0, "prefs"

    .line 76
    .line 77
    invoke-virtual {v5, p0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-nez p0, :cond_2

    .line 82
    .line 83
    new-instance p0, Lti1;

    .line 84
    .line 85
    const-string v0, "\u914d\u7f6e\u6587\u4ef6\u7f3a\u5c11 prefs \u6570\u636e"

    .line 86
    .line 87
    invoke-static {v0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-direct {p0, v4, v4, v4, v0}, Lti1;-><init>(ZIILjava/util/List;)V

    .line 92
    .line 93
    .line 94
    goto/16 :goto_6

    .line 95
    .line 96
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-static {v5}, Lus1;->τ(Ljava/util/Iterator;)Lss1;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-static {v5}, Lus1;->Ζ(Lss1;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-static {v5}, Lxh;->Ю(Ljava/lang/Iterable;)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    move v6, v4

    .line 125
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    if-eqz v7, :cond_a

    .line 130
    .line 131
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    check-cast v7, Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-static {v7}, Lln0;->Ο(Ljava/lang/String;)Z

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    if-nez v8, :cond_3

    .line 145
    .line 146
    new-instance v8, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v7, ": \u975e DYHelper \u914d\u7f6e\u6587\u4ef6\uff0c\u5df2\u8df3\u8fc7"

    .line 155
    .line 156
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_3
    invoke-virtual {p0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    if-nez v8, :cond_4

    .line 172
    .line 173
    new-instance v8, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    const-string v7, ": entries \u4e0d\u662f\u5bf9\u8c61"

    .line 182
    .line 183
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_4
    :try_start_3
    invoke-static {v2, v7}, Lui1;->Δ(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 195
    .line 196
    .line 197
    move-result-object v9

    .line 198
    invoke-interface {v9}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    invoke-interface {v9}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 203
    .line 204
    .line 205
    move-result-object v9

    .line 206
    invoke-virtual {v8}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object v10

    .line 210
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    invoke-static {v10}, Lus1;->τ(Ljava/util/Iterator;)Lss1;

    .line 214
    .line 215
    .line 216
    move-result-object v10

    .line 217
    invoke-static {v10}, Lus1;->Ζ(Lss1;)Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v10

    .line 221
    invoke-static {v10}, Lxh;->Ю(Ljava/lang/Iterable;)Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 226
    .line 227
    .line 228
    move-result-object v10

    .line 229
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 230
    .line 231
    .line 232
    move-result v11

    .line 233
    if-eqz v11, :cond_7

    .line 234
    .line 235
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v11

    .line 239
    check-cast v11, Ljava/lang/String;

    .line 240
    .line 241
    invoke-virtual {v8, v11}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 242
    .line 243
    .line 244
    move-result-object v12

    .line 245
    if-nez v12, :cond_5

    .line 246
    .line 247
    new-instance v12, Ljava/lang/StringBuilder;

    .line 248
    .line 249
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    const-string v13, "/"

    .line 256
    .line 257
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    const-string v11, ": value \u4e0d\u662f\u5bf9\u8c61"

    .line 264
    .line 265
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v11

    .line 272
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    goto :goto_2

    .line 276
    :catchall_2
    move-exception v8

    .line 277
    goto :goto_3

    .line 278
    :cond_5
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    invoke-static {v9, v11, v12}, Lv71;->ξ(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Lorg/json/JSONObject;)Z

    .line 285
    .line 286
    .line 287
    move-result v12

    .line 288
    if-eqz v12, :cond_6

    .line 289
    .line 290
    add-int/lit8 v6, v6, 0x1

    .line 291
    .line 292
    goto :goto_2

    .line 293
    :cond_6
    new-instance v12, Ljava/lang/StringBuilder;

    .line 294
    .line 295
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    const-string v13, "/"

    .line 302
    .line 303
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    const-string v11, ": \u4e0d\u652f\u6301\u7684\u503c\u7c7b\u578b"

    .line 310
    .line 311
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v11

    .line 318
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    goto :goto_2

    .line 322
    :cond_7
    invoke-interface {v9}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 323
    .line 324
    .line 325
    move-result v8

    .line 326
    if-eqz v8, :cond_8

    .line 327
    .line 328
    add-int/lit8 v4, v4, 0x1

    .line 329
    .line 330
    goto/16 :goto_1

    .line 331
    .line 332
    :cond_8
    new-instance v8, Ljava/lang/StringBuilder;

    .line 333
    .line 334
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    const-string v9, ": commit=false"

    .line 341
    .line 342
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v8

    .line 349
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 350
    .line 351
    .line 352
    goto/16 :goto_1

    .line 353
    .line 354
    :goto_3
    :try_start_4
    invoke-virtual {v8}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v9

    .line 358
    if-nez v9, :cond_9

    .line 359
    .line 360
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    move-result-object v8

    .line 364
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v9

    .line 368
    :cond_9
    new-instance v8, Ljava/lang/StringBuilder;

    .line 369
    .line 370
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    const-string v7, ": "

    .line 377
    .line 378
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v7

    .line 388
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    goto/16 :goto_1

    .line 392
    .line 393
    :cond_a
    const-string p0, "dyhelper_prefs"

    .line 394
    .line 395
    invoke-static {v2, p0}, Lui1;->Δ(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 396
    .line 397
    .line 398
    move-result-object p0

    .line 399
    sput-object p0, Lui1;->γ:Landroid/content/SharedPreferences;

    .line 400
    .line 401
    const-string p0, "dyhelper_prefs_meta"

    .line 402
    .line 403
    invoke-static {v2, p0}, Lui1;->Δ(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 404
    .line 405
    .line 406
    move-result-object p0

    .line 407
    sput-object p0, Lui1;->ε:Landroid/content/SharedPreferences;

    .line 408
    .line 409
    sget-object p0, Lui1;->γ:Landroid/content/SharedPreferences;

    .line 410
    .line 411
    sput-object p0, Lui1;->δ:Landroid/content/SharedPreferences;

    .line 412
    .line 413
    const-string p0, ""

    .line 414
    .line 415
    sput-object p0, Lui1;->ζ:Ljava/lang/String;

    .line 416
    .line 417
    sget-object p0, Lui1;->ε:Landroid/content/SharedPreferences;

    .line 418
    .line 419
    if-eqz p0, :cond_b

    .line 420
    .line 421
    const-string v2, "last_uid"

    .line 422
    .line 423
    const-string v5, ""

    .line 424
    .line 425
    invoke-interface {p0, v2, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object p0

    .line 429
    if-eqz p0, :cond_b

    .line 430
    .line 431
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 432
    .line 433
    .line 434
    move-result-object p0

    .line 435
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object p0

    .line 439
    goto :goto_4

    .line 440
    :cond_b
    move-object p0, v3

    .line 441
    :goto_4
    if-nez p0, :cond_c

    .line 442
    .line 443
    const-string p0, ""

    .line 444
    .line 445
    :cond_c
    sput-object p0, Lui1;->η:Ljava/lang/String;

    .line 446
    .line 447
    sget-object p0, Lui1;->η:Ljava/lang/String;

    .line 448
    .line 449
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 450
    .line 451
    .line 452
    move-result v2

    .line 453
    if-nez v2, :cond_d

    .line 454
    .line 455
    const-string v2, "0"

    .line 456
    .line 457
    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    if-nez v2, :cond_d

    .line 462
    .line 463
    goto :goto_5

    .line 464
    :cond_d
    move-object p0, v3

    .line 465
    :goto_5
    if-eqz p0, :cond_e

    .line 466
    .line 467
    const-string v2, "import-user-prefs"

    .line 468
    .line 469
    invoke-static {p0, v2}, Lui1;->Ξ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 470
    .line 471
    .line 472
    :cond_e
    sget-wide v7, Lui1;->θ:J

    .line 473
    .line 474
    const-wide/16 v9, 0x1

    .line 475
    .line 476
    add-long/2addr v7, v9

    .line 477
    sput-wide v7, Lui1;->θ:J

    .line 478
    .line 479
    new-instance p0, Lti1;

    .line 480
    .line 481
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 482
    .line 483
    .line 484
    move-result v2

    .line 485
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    invoke-direct {p0, v2, v4, v6, v0}, Lti1;-><init>(ZIILjava/util/List;)V

    .line 490
    .line 491
    .line 492
    const/4 v4, 0x1

    .line 493
    goto :goto_6

    .line 494
    :cond_f
    new-instance v2, Lti1;

    .line 495
    .line 496
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v5

    .line 500
    if-nez v5, :cond_10

    .line 501
    .line 502
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    move-result-object p0

    .line 506
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v5

    .line 510
    :cond_10
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object p0

    .line 514
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 515
    .line 516
    .line 517
    move-result-object p0

    .line 518
    invoke-direct {v2, v4, v4, v4, p0}, Lti1;-><init>(ZIILjava/util/List;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 519
    .line 520
    .line 521
    move-object p0, v2

    .line 522
    :goto_6
    monitor-exit v1

    .line 523
    if-eqz v4, :cond_11

    .line 524
    .line 525
    invoke-static {}, Lui1;->κ()Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    invoke-static {v0}, Lui1;->Γ(Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    const-string v0, "*"

    .line 533
    .line 534
    invoke-static {v0}, Lui1;->Β(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    :cond_11
    const-string v0, "r24d5e64064e1c279"

    .line 538
    .line 539
    iget-boolean v1, p0, Lti1;->α:Z

    .line 540
    .line 541
    iget v2, p0, Lti1;->β:I

    .line 542
    .line 543
    iget v4, p0, Lti1;->γ:I

    .line 544
    .line 545
    iget-object v5, p0, Lti1;->δ:Ljava/util/List;

    .line 546
    .line 547
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 548
    .line 549
    .line 550
    move-result v5

    .line 551
    new-instance v6, Ljava/lang/StringBuilder;

    .line 552
    .line 553
    const-string v7, "\u5df2\u5bfc\u5165\u7528\u6237\u914d\u7f6e success="

    .line 554
    .line 555
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    const-string v1, ", prefs="

    .line 562
    .line 563
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    const-string v1, ", keys="

    .line 570
    .line 571
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 575
    .line 576
    .line 577
    const-string v1, ", failures="

    .line 578
    .line 579
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    const/4 v2, 0x4

    .line 590
    invoke-static {v0, v1, v3, v2, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 591
    .line 592
    .line 593
    return-object p0

    .line 594
    :goto_7
    monitor-exit v1

    .line 595
    throw p0
.end method

.method public static π(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "com.example.dyhelper"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {p0}, Lui1;->ρ(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string v0, "\u5bbf\u4e3b\u8fdb\u7a0b"

    .line 21
    .line 22
    invoke-static {p0, v0}, Lui1;->σ(Landroid/content/Context;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static ρ(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    const-string v0, "~79F5E25B4ED201D89B6CE77FECC600ECA88AB6F7485F4A97"

    .line 5
    .line 6
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const-string v1, "\u6a21\u5757\u8fdb\u7a0b -> \u5bbf\u4e3b\u76ee\u5f55"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lui1;->σ(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "\u5bbf\u4e3b\u504f\u597d\u521d\u59cb\u5316\u5931\u8d25\uff0c\u56de\u9000\u6a21\u5757\u76ee\u5f55: "

    .line 30
    .line 31
    invoke-static {v1, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/4 v1, 0x4

    .line 36
    const-string v2, "r24d5e64064e1c279"

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-static {v2, v0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const-string v0, "\u6a21\u5757\u76ee\u5f55\u56de\u9000"

    .line 43
    .line 44
    invoke-static {p0, v0}, Lui1;->σ(Landroid/content/Context;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public static σ(Landroid/content/Context;Ljava/lang/String;)V
    .locals 11

    .line 1
    const-string v0, "init:"

    .line 2
    .line 3
    const-string v1, "SharedPreferences \u521d\u59cb\u5316\u6210\u529f("

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    sget-object v3, Lui1;->α:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v3

    .line 10
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    if-nez v4, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p0, v4

    .line 18
    :goto_0
    sget-object v4, Lui1;->β:Landroid/content/Context;

    .line 19
    .line 20
    const-string v5, "~79F5E25B4ED201D89B6CE77FECC600ECA88AB6F7485F4A97"

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-nez v6, :cond_9

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-static {v6, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_9

    .line 51
    .line 52
    :cond_1
    sget-object v5, Lui1;->ζ:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-eqz v6, :cond_2

    .line 59
    .line 60
    sget-object v5, Lui1;->η:Ljava/lang/String;

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception p0

    .line 64
    goto/16 :goto_6

    .line 65
    .line 66
    :cond_2
    :goto_1
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    const/4 v7, 0x0

    .line 71
    if-eqz v6, :cond_4

    .line 72
    .line 73
    sget-object v5, Lui1;->ε:Landroid/content/SharedPreferences;

    .line 74
    .line 75
    if-eqz v5, :cond_3

    .line 76
    .line 77
    const-string v6, "last_uid"

    .line 78
    .line 79
    const-string v8, ""

    .line 80
    .line 81
    invoke-interface {v5, v6, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    goto :goto_2

    .line 86
    :cond_3
    move-object v5, v7

    .line 87
    :goto_2
    if-nez v5, :cond_4

    .line 88
    .line 89
    const-string v5, ""

    .line 90
    .line 91
    :cond_4
    invoke-static {v5}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    const/4 v6, 0x1

    .line 100
    const/4 v8, 0x0

    .line 101
    if-nez v4, :cond_6

    .line 102
    .line 103
    sget-object v9, Lui1;->γ:Landroid/content/SharedPreferences;

    .line 104
    .line 105
    if-nez v9, :cond_6

    .line 106
    .line 107
    sget-object v9, Lui1;->δ:Landroid/content/SharedPreferences;

    .line 108
    .line 109
    if-eqz v9, :cond_5

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    move v9, v8

    .line 113
    goto :goto_4

    .line 114
    :cond_6
    :goto_3
    move v9, v6

    .line 115
    :goto_4
    sput-object p0, Lui1;->β:Landroid/content/Context;

    .line 116
    .line 117
    const-string v10, "dyhelper_prefs"

    .line 118
    .line 119
    invoke-static {p0, v10}, Lui1;->Δ(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    sput-object v10, Lui1;->γ:Landroid/content/SharedPreferences;

    .line 124
    .line 125
    const-string v10, "dyhelper_prefs_meta"

    .line 126
    .line 127
    invoke-static {p0, v10}, Lui1;->Δ(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    sput-object p0, Lui1;->ε:Landroid/content/SharedPreferences;

    .line 132
    .line 133
    if-eqz v9, :cond_7

    .line 134
    .line 135
    sput-object v7, Lui1;->δ:Landroid/content/SharedPreferences;

    .line 136
    .line 137
    const-string p0, ""

    .line 138
    .line 139
    sput-object p0, Lui1;->ζ:Ljava/lang/String;

    .line 140
    .line 141
    sput-object v5, Lui1;->η:Ljava/lang/String;

    .line 142
    .line 143
    :cond_7
    sget-object p0, Lui1;->γ:Landroid/content/SharedPreferences;

    .line 144
    .line 145
    invoke-static {p0}, Lui1;->Λ(Landroid/content/SharedPreferences;)V

    .line 146
    .line 147
    .line 148
    const-string p0, "r24d5e64064e1c279"

    .line 149
    .line 150
    if-eqz v9, :cond_8

    .line 151
    .line 152
    if-eqz v4, :cond_8

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_8
    move v6, v8

    .line 156
    :goto_5
    new-instance v4, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v1, "), replaced="

    .line 165
    .line 166
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    const/4 v4, 0x4

    .line 177
    invoke-static {p0, v1, v7, v4, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    :cond_9
    sget-object p0, Lui1;->η:Ljava/lang/String;

    .line 181
    .line 182
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-eqz v1, :cond_b

    .line 187
    .line 188
    sget-object p0, Lui1;->ε:Landroid/content/SharedPreferences;

    .line 189
    .line 190
    if-eqz p0, :cond_a

    .line 191
    .line 192
    const-string v1, "last_uid"

    .line 193
    .line 194
    const-string v4, ""

    .line 195
    .line 196
    invoke-interface {p0, v1, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    if-nez p0, :cond_b

    .line 201
    .line 202
    :cond_a
    const-string p0, ""

    .line 203
    .line 204
    :cond_b
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-nez v1, :cond_c

    .line 217
    .line 218
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-static {p0, p1}, Lui1;->Ξ(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 223
    .line 224
    .line 225
    move-object v2, p0

    .line 226
    :cond_c
    monitor-exit v3

    .line 227
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 228
    .line 229
    .line 230
    move-result p0

    .line 231
    if-nez p0, :cond_d

    .line 232
    .line 233
    invoke-static {v2}, Lui1;->Γ(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    :cond_d
    return-void

    .line 237
    :goto_6
    monitor-exit v3

    .line 238
    throw p0
.end method

.method public static τ()Z
    .locals 3

    .line 1
    const-string v0, "clean_progress_bar_enabled"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string v0, "clean_progress_bar_only_in_clean_mode"

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-static {v0, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    const-string v0, "clean_mode_enabled"

    .line 21
    .line 22
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    :goto_0
    return v1

    .line 30
    :cond_2
    :goto_1
    return v2
.end method

.method public static υ(Ljava/lang/String;)Z
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "comment_control_"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, "_color_enabled"

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {p0, v0}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0
.end method

.method public static φ()Z
    .locals 2

    .line 1
    const-string v0, "comment_control_custom_enabled"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public static χ(Ljava/lang/String;)Z
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "comment_control_"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, "_visible"

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-static {p0, v0}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0
.end method

.method public static ψ()Z
    .locals 2

    .line 1
    const-string v0, "feed_follow_confirm_enabled"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public static ω(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "feed_right_control_hide_"

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-static {p0, v0}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method
