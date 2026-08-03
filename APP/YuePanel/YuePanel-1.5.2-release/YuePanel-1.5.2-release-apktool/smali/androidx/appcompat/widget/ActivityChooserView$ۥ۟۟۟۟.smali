.class public Landroidx/appcompat/widget/ActivityChooserView$ۥ۟۟۟۟;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/ActivityChooserView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:Landroidx/appcompat/widget/ActivityChooserView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ActivityChooserView;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$ۥ۟۟۟۟;->ۥ:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    invoke-super {p0}, Landroid/database/DataSetObserver;->onChanged()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView$ۥ۟۟۟۟;->ۥ:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActivityChooserView;->ۥ۟۟۟۟()V

    return-void
.end method
