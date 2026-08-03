.class public LYue/ۥۡۥ۠ۥ$ۥ۟۟;
.super Landroid/print/PrintDocumentAdapter;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x13
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۥ۠ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/String;

.field public final ۥ۟:I

.field public final ۥ۟۟:Landroid/graphics/Bitmap;

.field public final ۥ۟۟۟:LYue/ۥۡۥ۠ۥ$ۥ۟;

.field public ۥ۟۟۟۟:Landroid/print/PrintAttributes;

.field public final synthetic ۥ۟۟۟۠:LYue/ۥۡۥ۠ۥ;


# direct methods
.method public constructor <init>(LYue/ۥۡۥ۠ۥ;Ljava/lang/String;ILandroid/graphics/Bitmap;LYue/ۥۡۥ۠ۥ$ۥ۟;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۥ۠ۥ$ۥ۟۟;->ۥ۟۟۟۠:LYue/ۥۡۥ۠ۥ;

    invoke-direct {p0}, Landroid/print/PrintDocumentAdapter;-><init>()V

    iput-object p2, p0, LYue/ۥۡۥ۠ۥ$ۥ۟۟;->ۥ:Ljava/lang/String;

    iput p3, p0, LYue/ۥۡۥ۠ۥ$ۥ۟۟;->ۥ۟:I

    iput-object p4, p0, LYue/ۥۡۥ۠ۥ$ۥ۟۟;->ۥ۟۟:Landroid/graphics/Bitmap;

    iput-object p5, p0, LYue/ۥۡۥ۠ۥ$ۥ۟۟;->ۥ۟۟۟:LYue/ۥۡۥ۠ۥ$ۥ۟;

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۥ۠ۥ$ۥ۟۟;->ۥ۟۟۟:LYue/ۥۡۥ۠ۥ$ۥ۟;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LYue/ۥۡۥ۠ۥ$ۥ۟;->ۥ()V

    :cond_0
    return-void
.end method

.method public onLayout(Landroid/print/PrintAttributes;Landroid/print/PrintAttributes;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$LayoutResultCallback;Landroid/os/Bundle;)V
    .locals 0

    iput-object p2, p0, LYue/ۥۡۥ۠ۥ$ۥ۟۟;->ۥ۟۟۟۟:Landroid/print/PrintAttributes;

    new-instance p3, Landroid/print/PrintDocumentInfo$Builder;

    iget-object p5, p0, LYue/ۥۡۥ۠ۥ$ۥ۟۟;->ۥ:Ljava/lang/String;

    invoke-direct {p3, p5}, Landroid/print/PrintDocumentInfo$Builder;-><init>(Ljava/lang/String;)V

    const/4 p5, 0x1

    invoke-virtual {p3, p5}, Landroid/print/PrintDocumentInfo$Builder;->setContentType(I)Landroid/print/PrintDocumentInfo$Builder;

    move-result-object p3

    invoke-virtual {p3, p5}, Landroid/print/PrintDocumentInfo$Builder;->setPageCount(I)Landroid/print/PrintDocumentInfo$Builder;

    move-result-object p3

    invoke-virtual {p3}, Landroid/print/PrintDocumentInfo$Builder;->build()Landroid/print/PrintDocumentInfo;

    move-result-object p3

    invoke-virtual {p2, p1}, Landroid/print/PrintAttributes;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, p5

    invoke-virtual {p4, p3, p1}, Landroid/print/PrintDocumentAdapter$LayoutResultCallback;->onLayoutFinished(Landroid/print/PrintDocumentInfo;Z)V

    return-void
.end method

.method public onWrite([Landroid/print/PageRange;Landroid/os/ParcelFileDescriptor;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$WriteResultCallback;)V
    .locals 7

    iget-object v0, p0, LYue/ۥۡۥ۠ۥ$ۥ۟۟;->ۥ۟۟۟۠:LYue/ۥۡۥ۠ۥ;

    iget-object v1, p0, LYue/ۥۡۥ۠ۥ$ۥ۟۟;->ۥ۟۟۟۟:Landroid/print/PrintAttributes;

    iget v2, p0, LYue/ۥۡۥ۠ۥ$ۥ۟۟;->ۥ۟:I

    iget-object v3, p0, LYue/ۥۡۥ۠ۥ$ۥ۟۟;->ۥ۟۟:Landroid/graphics/Bitmap;

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v0 .. v6}, LYue/ۥۡۥ۠ۥ;->ۥ۟۟۠ۡ(Landroid/print/PrintAttributes;ILandroid/graphics/Bitmap;Landroid/os/ParcelFileDescriptor;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$WriteResultCallback;)V

    return-void
.end method
