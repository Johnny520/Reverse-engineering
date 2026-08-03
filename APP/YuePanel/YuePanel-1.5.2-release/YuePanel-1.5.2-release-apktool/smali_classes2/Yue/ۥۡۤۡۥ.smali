.class public final LYue/ۥۡۤۡۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:LYue/ۥۡۤۡۤ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥ۠ۥۨۥ;

    invoke-direct {v0}, LYue/ۥ۠ۥۨۥ;-><init>()V

    sput-object v0, LYue/ۥۡۤۡۥ;->ۥ:LYue/ۥۡۤۡۤ;

    return-void
.end method

.method public static final ۥ(III)Z
    .locals 1
    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    sget-object v0, LYue/ۥ۠ۦۧۨ;->ۥ۟۟ۡ:LYue/ۥ۠ۦۧۨ;

    invoke-virtual {v0, p0, p1, p2}, LYue/ۥ۠ۦۧۨ;->ۥۣ۟۟۟(III)Z

    move-result p0

    return p0
.end method

.method public static final synthetic ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    const-string v0, "T"

    const/4 v1, 0x1

    :try_start_0
    invoke-static {v1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠ۨ(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    const/4 v2, 0x4

    invoke-static {v2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠ۨ(ILjava/lang/String;)V

    const-class v0, Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Ljava/lang/ClassNotFoundException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Instance class was loaded from a different classloader: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", base type classloader: "

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0, v1}, Ljava/lang/ClassNotFoundException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_0
    throw v1
.end method
