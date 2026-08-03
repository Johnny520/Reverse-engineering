.class public final L۟/kc$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/kc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/kc;


# direct methods
.method public constructor <init>(L۟/kc;)V
    .locals 0

    iput-object p1, p0, L۟/kc$c;->ۥ:L۟/kc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, L۟/kc$c;->ۥ:L۟/kc;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, L۟/kc;->setScrollState(I)V

    iget-object v0, p0, L۟/kc$c;->ۥ:L۟/kc;

    invoke-virtual {v0}, L۟/kc;->ۥ۠۠()V

    return-void
.end method
