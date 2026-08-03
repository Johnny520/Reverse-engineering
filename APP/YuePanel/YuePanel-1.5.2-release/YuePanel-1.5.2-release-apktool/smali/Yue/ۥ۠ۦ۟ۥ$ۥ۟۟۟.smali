.class public final LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۦ۟ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:Landroid/content/Intent;

.field public final ۥ۟:I

.field public final synthetic ۥ۟۟:LYue/ۥ۠ۦ۟ۥ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۦ۟ۥ;Landroid/content/Intent;I)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟;->ۥ۟۟:LYue/ۥ۠ۦ۟ۥ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟;->ۥ:Landroid/content/Intent;

    iput p3, p0, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟;->ۥ۟:I

    return-void
.end method


# virtual methods
.method public complete()V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟;->ۥ۟۟:LYue/ۥ۠ۦ۟ۥ;

    iget v1, p0, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟;->ۥ۟:I

    invoke-virtual {v0, v1}, Landroid/app/Service;->stopSelf(I)V

    return-void
.end method

.method public getIntent()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟;->ۥ:Landroid/content/Intent;

    return-object v0
.end method
