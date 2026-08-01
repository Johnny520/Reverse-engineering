.class public final Ltop/anjao2024/xp1whs/App$a;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/anjao2024/xp1whs/App;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lpl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ltop/anjao2024/xp1whs/App$a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic a(Ltop/anjao2024/xp1whs/App$a;Ltop/anjao2024/xp1whs/App$b;Llf1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ltop/anjao2024/xp1whs/App$a;->c(Ltop/anjao2024/xp1whs/App$b;Llf1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final c(Ltop/anjao2024/xp1whs/App$b;Llf1;)V
    .locals 0

    .line 1
    invoke-static {}, Ltop/anjao2024/xp1whs/App;->d()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p1, p2}, Ltop/anjao2024/xp1whs/App$b;->onServiceStateChanged(Llf1;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method


# virtual methods
.method public final b(Ltop/anjao2024/xp1whs/App$b;Z)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ltop/anjao2024/xp1whs/App;->d()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ltop/anjao2024/xp1whs/App$a;->d()Llf1;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-direct {p0, p1, p2}, Ltop/anjao2024/xp1whs/App$a;->c(Ltop/anjao2024/xp1whs/App$b;Llf1;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final d()Llf1;
    .locals 0

    .line 1
    invoke-static {}, Ltop/anjao2024/xp1whs/App;->c()Llf1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final e(Ltop/anjao2024/xp1whs/App$b;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ltop/anjao2024/xp1whs/App;->d()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method
