.class public abstract LYue/ۥۢۥۣۥ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۥۣۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u06e5\u06df"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۥۣۥ$ۥ۟$ۥ;
    }
.end annotation


# static fields
.field public static final DISPATCH_MODE_CONTINUE_ON_SUBTREE:I = 0x1

.field public static final DISPATCH_MODE_STOP:I


# instance fields
.field mDispachedInsets:Landroid/view/WindowInsets;

.field private final mDispatchMode:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LYue/ۥۢۥۣۥ$ۥ۟;->mDispatchMode:I

    return-void
.end method


# virtual methods
.method public final getDispatchMode()I
    .locals 1

    iget v0, p0, LYue/ۥۢۥۣۥ$ۥ۟;->mDispatchMode:I

    return v0
.end method

.method public onEnd(LYue/ۥۢۥۣۥ;)V
    .locals 0
    .param p1    # LYue/ۥۢۥۣۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    return-void
.end method

.method public onPrepare(LYue/ۥۢۥۣۥ;)V
    .locals 0
    .param p1    # LYue/ۥۢۥۣۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    return-void
.end method

.method public abstract onProgress(LYue/ۥۢۥۦ;Ljava/util/List;)LYue/ۥۢۥۦ;
    .param p1    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06e5\u06e6;",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06e5\u06e3\u06e5;",
            ">;)",
            "LYue/\u06e5\u06e2\u06e5\u06e6;"
        }
    .end annotation
.end method

.method public onStart(LYue/ۥۢۥۣۥ;LYue/ۥۢۥۣۥ$ۥ;)LYue/ۥۢۥۣۥ$ۥ;
    .locals 0
    .param p1    # LYue/ۥۢۥۣۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢۥۣۥ$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    return-object p2
.end method
