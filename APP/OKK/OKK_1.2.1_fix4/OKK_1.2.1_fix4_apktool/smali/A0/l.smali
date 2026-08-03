.class public final synthetic LA0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AutoCompleteTextView$OnDismissListener;


# instance fields
.field public final synthetic a:LA0/o;


# direct methods
.method public synthetic constructor <init>(LA0/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA0/l;->a:LA0/o;

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 4

    const/4 v0, 0x1

    iget-object v1, p0, LA0/l;->a:LA0/o;

    iput-boolean v0, v1, LA0/o;->m:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, LA0/o;->o:J

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, LA0/o;->t(Z)V

    return-void
.end method
