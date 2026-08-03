.class public final LYue/ۥ۠ۡۢۥ$ۥ۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۡۢۥ;->ۥ۟(Ljava/lang/Class;)LYue/ۥۣ۠ۡ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# static fields
.field public static final ۥۣ۟۟۠:LYue/ۥ۠ۡۢۥ$ۥ۟;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥ۠ۡۢۥ$ۥ۟;

    invoke-direct {v0}, LYue/ۥ۠ۡۢۥ$ۥ۟;-><init>()V

    sput-object v0, LYue/ۥ۠ۡۢۥ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥ۠ۡۢۥ$ۥ۟;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LYue/ۥ۠ۡۢۥ$ۥ۟;->ۥ۟۟(Ljava/lang/Throwable;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(Ljava/lang/Throwable;)Ljava/lang/Void;
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method
