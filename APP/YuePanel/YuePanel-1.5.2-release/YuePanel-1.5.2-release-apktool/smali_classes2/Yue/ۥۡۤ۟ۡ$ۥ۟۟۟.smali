.class public final LYue/ۥۡۤ۟ۡ$ۥ۟۟۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۤ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۤ۟ۡ;->ۥ۟۟ۢۡ(Ljava/nio/file/Path;Ljava/nio/file/Path;LYue/ۥۣ۠ۢۤ;ZLYue/ۥۣ۠ۢۤ;ILjava/lang/Object;)Ljava/nio/file/Path;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# static fields
.field public static final ۥۣ۟۟۠:LYue/ۥۡۤ۟ۡ$ۥ۟۟۟;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۡۤ۟ۡ$ۥ۟۟۟;

    invoke-direct {v0}, LYue/ۥۡۤ۟ۡ$ۥ۟۟۟;-><init>()V

    sput-object v0, LYue/ۥۡۤ۟ۡ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥۡۤ۟ۡ$ۥ۟۟۟;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/lang/Void;
    .locals 1
    .param p1    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Exception;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "<anonymous parameter 1>"

    invoke-static {p2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "exception"

    invoke-static {p3, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    throw p3
.end method

.method public bridge synthetic ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/nio/file/Path;

    check-cast p2, Ljava/nio/file/Path;

    check-cast p3, Ljava/lang/Exception;

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۡۤ۟ۡ$ۥ۟۟۟;->ۥ۟۟(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
