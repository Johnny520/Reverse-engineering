.class public final LYue/ۥ۟ۤۧۤ$ۥ;
.super Ljava/lang/ClassValue;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۤۧۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ClassValue<",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "-",
        "Ljava/lang/Throwable;",
        "+",
        "Ljava/lang/Throwable;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/ClassValue;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic computeValue(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤۧۤ$ۥ;->ۥ(Ljava/lang/Class;)LYue/ۥۣ۠ۡ۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ(Ljava/lang/Class;)LYue/ۥۣ۠ۡ۟;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "Ljava/lang/Throwable;",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-static {p1}, LYue/ۥ۠ۡۢۥ;->ۥ(Ljava/lang/Class;)LYue/ۥۣ۠ۡ۟;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
