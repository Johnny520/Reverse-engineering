.class public LYue/ۥۣ۟ۡۧ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۨ(Ljava/lang/ref/WeakReference;Landroid/graphics/Typeface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroid/widget/TextView;

.field public final synthetic ۥ۟۟۠ۤ:Landroid/graphics/Typeface;

.field public final synthetic ۥ۟۟۠ۥ:I

.field public final synthetic ۥ۟۟۠ۦ:LYue/ۥۣ۟ۡۧ;


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۡۧ;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010,
            0x1010
        }
        names = {
            null,
            null,
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣ۟ۡۧ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۡۧ;

    iput-object p2, p0, LYue/ۥۣ۟ۡۧ$ۥ۟;->ۥۣ۟۟۠:Landroid/widget/TextView;

    iput-object p3, p0, LYue/ۥۣ۟ۡۧ$ۥ۟;->ۥ۟۟۠ۤ:Landroid/graphics/Typeface;

    iput p4, p0, LYue/ۥۣ۟ۡۧ$ۥ۟;->ۥ۟۟۠ۥ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ$ۥ۟;->ۥۣ۟۟۠:Landroid/widget/TextView;

    iget-object v1, p0, LYue/ۥۣ۟ۡۧ$ۥ۟;->ۥ۟۟۠ۤ:Landroid/graphics/Typeface;

    iget v2, p0, LYue/ۥۣ۟ۡۧ$ۥ۟;->ۥ۟۟۠ۥ:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    return-void
.end method
