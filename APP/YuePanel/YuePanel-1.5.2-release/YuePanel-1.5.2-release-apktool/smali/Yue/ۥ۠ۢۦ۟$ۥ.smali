.class public LYue/ۥ۠ۢۦ۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۢۦ۟;->ۥ۟۟۟۟(Landroid/content/Context;LYue/ۥ۠ۢۥۧ;LYue/ۥۣ۟ۧ۟;II)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "LYue/\u06e5\u06e0\u06e2\u06e6\u06df$\u06e5\u06df\u06df\u06df\u06df;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:Ljava/lang/String;

.field public final synthetic ۥ۟:Landroid/content/Context;

.field public final synthetic ۥ۟۟:LYue/ۥ۠ۢۥۧ;

.field public final synthetic ۥ۟۟۟:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;LYue/ۥ۠ۢۥۧ;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۢۦ۟$ۥ;->ۥ:Ljava/lang/String;

    iput-object p2, p0, LYue/ۥ۠ۢۦ۟$ۥ;->ۥ۟:Landroid/content/Context;

    iput-object p3, p0, LYue/ۥ۠ۢۦ۟$ۥ;->ۥ۟۟:LYue/ۥ۠ۢۥۧ;

    iput p4, p0, LYue/ۥ۠ۢۦ۟$ۥ;->ۥ۟۟۟:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۢۦ۟$ۥ;->ۥ()LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;
    .locals 4

    iget-object v0, p0, LYue/ۥ۠ۢۦ۟$ۥ;->ۥ:Ljava/lang/String;

    iget-object v1, p0, LYue/ۥ۠ۢۦ۟$ۥ;->ۥ۟:Landroid/content/Context;

    iget-object v2, p0, LYue/ۥ۠ۢۦ۟$ۥ;->ۥ۟۟:LYue/ۥ۠ۢۥۧ;

    iget v3, p0, LYue/ۥ۠ۢۦ۟$ۥ;->ۥ۟۟۟:I

    invoke-static {v0, v1, v2, v3}, LYue/ۥ۠ۢۦ۟;->ۥ۟۟(Ljava/lang/String;Landroid/content/Context;LYue/ۥ۠ۢۥۧ;I)LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;

    move-result-object v0

    return-object v0
.end method
