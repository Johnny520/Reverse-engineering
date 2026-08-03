.class public final L۟/kc$i;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/kc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "i"
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/kc;


# direct methods
.method public constructor <init>(L۟/kc;)V
    .locals 0

    iput-object p1, p0, L۟/kc$i;->ۥ:L۟/kc;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 1

    iget-object v0, p0, L۟/kc$i;->ۥ:L۟/kc;

    invoke-virtual {v0}, L۟/kc;->ۥ۟ۡ()V

    return-void
.end method

.method public final onInvalidated()V
    .locals 1

    iget-object v0, p0, L۟/kc$i;->ۥ:L۟/kc;

    invoke-virtual {v0}, L۟/kc;->ۥ۟ۡ()V

    return-void
.end method
