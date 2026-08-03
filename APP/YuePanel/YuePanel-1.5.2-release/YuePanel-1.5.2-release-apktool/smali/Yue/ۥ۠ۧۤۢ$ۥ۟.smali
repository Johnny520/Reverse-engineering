.class public final LYue/ۥ۠ۧۤۢ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۧۤۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final ۥ:Landroid/content/Intent;

.field public final ۥ۟:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "LYue/\u06e5\u06e0\u06e7\u06e4\u06e2$\u06e5\u06df\u06df;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Intent;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Ljava/util/ArrayList<",
            "LYue/\u06e5\u06e0\u06e7\u06e4\u06e2$\u06e5\u06df\u06df;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۧۤۢ$ۥ۟;->ۥ:Landroid/content/Intent;

    iput-object p2, p0, LYue/ۥ۠ۧۤۢ$ۥ۟;->ۥ۟:Ljava/util/ArrayList;

    return-void
.end method
