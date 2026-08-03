.class public LYue/ۥۣ۟ۧ۟$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟ۧ۟;->ۥ(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۠ۢۦۢ$ۥ۟۟۟;

.field public final synthetic ۥ۟۟۠ۤ:I

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۣ۟ۧ۟;


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۧ۟;LYue/ۥ۠ۢۦۢ$ۥ۟۟۟;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣ۟ۧ۟$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۧ۟;

    iput-object p2, p0, LYue/ۥۣ۟ۧ۟$ۥ۟;->ۥۣ۟۟۠:LYue/ۥ۠ۢۦۢ$ۥ۟۟۟;

    iput p3, p0, LYue/ۥۣ۟ۧ۟$ۥ۟;->ۥ۟۟۠ۤ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LYue/ۥۣ۟ۧ۟$ۥ۟;->ۥۣ۟۟۠:LYue/ۥ۠ۢۦۢ$ۥ۟۟۟;

    iget v1, p0, LYue/ۥۣ۟ۧ۟$ۥ۟;->ۥ۟۟۠ۤ:I

    invoke-virtual {v0, v1}, LYue/ۥ۠ۢۦۢ$ۥ۟۟۟;->ۥ(I)V

    return-void
.end method
