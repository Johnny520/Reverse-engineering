.class public final LYue/ۥ۠ۡۧۤ;
.super Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x5c

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native ۥ(Ljava/lang/Class;Ljava/lang/Class;I)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;I)",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Field;",
            ">;"
        }
    .end annotation
.end method

.method public static native ۥ۟(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public static native ۥ۟۟(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Field;",
            ">;"
        }
    .end annotation
.end method

.method public static native ۥ۟۟۟(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Field;",
            ">;"
        }
    .end annotation
.end method

.method public static ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/HashSet<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p2, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p2, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-object p0

    :cond_2
    :try_start_0
    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۟()Ljava/lang/ClassLoader;

    const/4 v2, 0x1

    invoke-static {v1, v0, v2}, LYue/ۥ۠ۡۧۤ;->ۥ(Ljava/lang/Class;Ljava/lang/Class;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Field;

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_4
    invoke-static {v2, p1, p2}, LYue/ۥ۠ۡۧۤ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    return-object v2

    :catchall_0
    :cond_5
    return-object v0
.end method

.method public static native ۥ۟۟۟۠(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;
        }
    .end annotation
.end method
